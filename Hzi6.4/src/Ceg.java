/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zsolt
 */
public class Ceg implements Comparable<Ceg> {
    
    private String nev;
    private String telep;
    private int ev;
    private int bev;
    private int hany;

    public Ceg(String nev, String telep, int ev, int bev) {
        this.nev = nev;
        this.telep = telep;
        this.ev = ev;
        this.bev = bev;
        this.hany = 1;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getTelep() {
        return telep;
    }

    public void setTelep(String telep) {
        this.telep = telep;
    }

    public int getEv() {
        return ev;
    }

    public void setEv(int ev) {
        this.ev = ev;
    }

    public int getBev() {
        return bev;
    }

    public void setBev(int bev) {
        this.bev = bev;
    }

    public int getHany() {
        return hany;
    }

    public void setHany(int hany) {
        this.hany = hany;
    }

    @Override
    public String toString() {
        return nev + " (" + telep + "): " + bev ;
    }

    @Override
    public int compareTo(Ceg o) {
        int diff=Integer.compare(o.bev, this.bev);
        if(diff==0)
            return -diff;
        
        diff=Integer.compare(o.hany, this.hany);
        if(diff==0)
            return diff;
        
        return o.nev.compareTo(this.nev);
    }
    
    
    
}
