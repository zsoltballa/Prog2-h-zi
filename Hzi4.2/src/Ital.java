
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zsolt
 */
public class Ital implements Comparable<Ital>{
    protected String nev;
    protected String kiszereles;
    protected int ar;

    public Ital(String nev, String kiszereles, int ar) {
        this.nev = nev;
        this.kiszereles = kiszereles;
        this.ar = ar;
    }

    public String getNev() {
        return nev;
    }

    public String getKiszereles() {
        return kiszereles;
    }

    public int getAr() {
        return ar;
    }

    @Override
    public String toString() {
        return nev + ", " + kiszereles + ", " + ar;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Ital) || obj==null)
            return false;
        
        Ital i=(Ital)obj;
        
        if(this.kiszereles.equals(i.kiszereles) && this.nev.equals(i.nev))
            return true;
        
        return false;
    }

    @Override
    public int compareTo(Ital o) {
        int diff= this.kiszereles.compareTo(o.kiszereles);
        if(diff!=0)
            return diff;
        
        return Integer.compare(this.ar, o.ar);
                
    }
    
    
}
