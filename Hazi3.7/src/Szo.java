/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zsolt
 */
public class Szo implements Comparable<Szo> {
    private String angol;
    private String magyar;

    public Szo(String angol, String magyar) {
        this.angol = angol;
        this.magyar = magyar;
    }
    
    @Override
    public int compareTo(Szo sz)
    {
        int diff= this.angol.compareTo(sz.angol);
        if(diff!=0)
            return diff;
        
        return (this.magyar.compareTo(sz.magyar));
    }

    @Override
    public String toString() {
        return angol + ":" + magyar;
    }
    
    
    
}
