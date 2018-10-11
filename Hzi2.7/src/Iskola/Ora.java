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
public class Ora {
    private int kód;
    private String név;
    private int kezdet;

    public Ora(int kód, String név, int kezdet) {
        this.kód = kód;
        this.név = név;
        if(kezdet<8)
            this.kezdet=8;
        else if(kezdet>19)
                this.kezdet=19;
            else
                this.kezdet=kezdet;
    }

    public int getKód() {
        return this.kód;
    }

    public String getNév() {
        return this.név;
    }

    public int getKezdet() {
        return this.kezdet;
    }

    public void setKód(int kód) {
        this.kód = kód;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public void setKezdet(int kezdet) {
        this.kezdet = kezdet;
    }

    @Override
    public String toString() {
        return "Ora{" + "k\u00f3d=" + kód + ", n\u00e9v=" + név + ", kezdet=" + kezdet + '}';
    }
    
    
    
}
