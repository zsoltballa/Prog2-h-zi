/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zsolt
 */
public class Katona {
    private double tamad;
    private double ved;

    public Katona() {
        this.tamad=5.5;
        this.ved=5.5;
    }

    public Katona(double tamad, double ved) {
        this.tamad = tamad;
        this.ved = ved;
    }

    public double getTamad() {
        return tamad;
    }

    public void setTamad(double tamad) {
        this.tamad = tamad;
    }

    public double getVed() {
        return ved;
    }

    public void setVed(double ved) {
        this.ved = ved;
    }

    @Override
    public String toString() {
        return "TE:[" + tamad + "]" + " VE:[" + ved + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Katona)) {
            return false;
        }
        Katona k=(Katona)obj;
        
        if((k.tamad==this.tamad) && (k.ved==this.ved))
            return true;
        
        return false;
    }
    
    
    
}
