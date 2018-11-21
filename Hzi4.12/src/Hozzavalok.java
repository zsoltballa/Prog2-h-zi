/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zsolt
 */
public class Hozzavalok implements Comparable<Hozzavalok>{
    private String termekNev;
    private int mennyiseg;
    private int menny;

    public Hozzavalok(String termekNev, int mennyiseg) {
        this.termekNev = termekNev;
        this.mennyiseg = mennyiseg;
    }

    public String getTermekNev() {
        return termekNev;
    }

    public void setTermekNev(String termekNev) {
        this.termekNev = termekNev;
    }

    public int getMennyiseg() {
        return mennyiseg;
    }

    public int getMenny() {
        return menny;
    }
    

    public void setMennyiseg(int mennyiseg) {
        this.mennyiseg = mennyiseg;
    }

    public void setMenny(int menny) {
        this.menny = menny;
    }

    @Override
    public String toString() {
        return this.termekNev+";"+this.mennyiseg;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Hozzavalok)){
            return false;
        }
        
        Hozzavalok h=(Hozzavalok)obj;
        
        return this.termekNev.equals(h.getMennyiseg());
    }

    @Override
    public int compareTo(Hozzavalok t) {
        
        if(this.mennyiseg==t.getMennyiseg()){
            return this.termekNev.compareTo(t.getTermekNev());
        }else{
            return (-1)*Integer.compare(mennyiseg, t.getMennyiseg());
        }
        
        
    }
       
}
