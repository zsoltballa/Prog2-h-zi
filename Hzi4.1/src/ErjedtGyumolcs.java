/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zsolt
 */
public class ErjedtGyumolcs extends Gyumolcs implements Alkoholos {
    
    private double alkoholTartalom;

    public ErjedtGyumolcs(double alkoholTartalom, String f, String i) {
        super(f, i);
        this.alkoholTartalom = alkoholTartalom;
    }
    
    

    @Override
    public double mennyiAlkoholtTartalmaz() {
        return this.alkoholTartalom;
    }

    @Override
    public String toString() {
        return "ErjedtGyumolcs{" + "alkoholTartalom=" + alkoholTartalom + '}';
    }
}
