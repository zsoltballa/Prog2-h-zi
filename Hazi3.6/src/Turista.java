/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zsolt
 */
import java.util.Arrays;

public class Turista implements Comparable<Turista> {
    private String nev;
    private int kek;
    private int helyi;

    public Turista(String nev, int kek, int helyi) {
        this.nev = nev;
        this.kek = kek;
        this.helyi = helyi;
    }

    public String getNev() {
        return nev;
    }
    
    public int compareTo(Turista t)
    {
        int diff=Integer.compare(this.kek, t.kek);
        if(diff!=0)
            return -diff;
        
        diff=Integer.compare(this.helyi, t.helyi);
        if(diff!=0)
            return -diff;

        return (this.nev.compareTo(t.nev));
    }
}
