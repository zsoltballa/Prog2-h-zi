/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iskola;

/**
 *
 * @author Zsolt
 */
public class Orarend{
    private String nap;
    private int n;
    private Ora[] óra;

    public Orarend(String nap) {
        this.nap = nap;
        this.n=0;
        this.óra= new Ora[12];
        for(int i = 0; i<12; i++)
            óra[i] = new Ora(0,"",0);
    }

    public String getNap() {
        return nap;
    }

    public int getN() {
        return n;
    }

    public Ora[] getÓra() {
        return óra;
    }

    public void setNap(String nap) {
        this.nap = nap;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setÓra(Ora[] óra) {
        this.óra = óra;
    }

    @Override
    public String toString() {
        return "Orarend{" + "nap=" + nap + ", n=" + n + ", \u00f3ra=" + óra + '}';
    }
    
    public boolean órátHozzáad(Ora o)
    {
        if(this.n>=12)
            return false;
            for(int i=0;i<=this.n;i++)
                if(this.óra[i].getKezdet()==o.getKezdet() && !this.óra[i].getNév().equals(""))
                    return false;
            this.óra[this.n]=o;
            this.n++;
            return true;
    }
    
}
