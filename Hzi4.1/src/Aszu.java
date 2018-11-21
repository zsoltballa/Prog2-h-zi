/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zsolt
 */
public class Aszu extends Bor {
    
    private int puttonySzam;

    public Aszu(int p, String i, double a) {
        super("Aszusodott szolo", "Tokaj", i, a);
        this.puttonySzam = p;
    }
    
    public int hanyPuttonyos(){
        return this.puttonySzam;
    }

    @Override
    public String toString() {
        return "Aszu{" + "puttonySzam=" + puttonySzam + '}';
    }
    
    
}
