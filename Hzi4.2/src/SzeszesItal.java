/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zsolt
 */
public class SzeszesItal extends Ital {
    private int alkoholTartalom;

    public SzeszesItal(int alkoholTartalom, String nev, String kiszereles, int ar) {
        super(nev, kiszereles, ar);
        this.alkoholTartalom = alkoholTartalom;
    }

    public int getAlkoholTartalom() {
        return alkoholTartalom;
    }
    
    @Override
    public String toString() {
        return this.alkoholTartalom + "% alkoholtartalmu "+ super.toString();
    }
    
    
    
}
