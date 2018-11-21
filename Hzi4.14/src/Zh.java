/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zsolt
 */
public class Zh implements Comparable<Zh>{
    private String nev;
    private int pont;

    public Zh(String nev, int pont) {
        this.nev = nev;
        this.pont = pont;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getPont() {
        return pont;
    }

    public void setPont(int pont) {
        this.pont = pont;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Zh)){
            return false;
        }
        Zh z=(Zh)obj;
        return this.nev.equals(z.getNev());
    }

    @Override
    public String toString() {
        return this.nev+": "+this.pont+" pont";
    }

    @Override
    public int compareTo(Zh t) {
        if(this.pont==t.getPont()){
            return this.nev.compareTo(t.getNev());
        }else{
            return (-1)*Integer.compare(this.pont, t.getPont());
        }
    
    }    
}
