/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zsolt
 */
public class Hatizsak implements Comparable<Hatizsak> {
    
    private String marka;
    private double urtartalom;
    private int zsebekszama;
    private boolean vizhatlan;

    public Hatizsak(String marka, double urtartalom, int zsebekszama, boolean vizhatlan) {
        this.marka = marka;
        this.urtartalom = urtartalom;
        this.zsebekszama = zsebekszama;
        this.vizhatlan = vizhatlan;
    }

    public String getMarka() {
        return marka;
    }

    public double getUrtartalom() {
        return urtartalom;
    }

    public int getZsebekszama() {
        return zsebekszama;
    }

    public boolean isVizhatlan() {
        return vizhatlan;
    }

    @Override
    public String toString() {
        return "Hatizsak{" + "marka=" + marka + ", urtartalom=" + urtartalom + ", zsebekszama=" + zsebekszama + ", vizhatlan=" + vizhatlan + '}';
    }
    
    @Override
    public int compareTo(Hatizsak o) {
        int diff=this.marka.compareTo(o.marka);
        if(diff!=0)
            return diff;
        
        return Integer.compare(this.zsebekszama, o.zsebekszama);
    }
    
}
