/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zsolt
 */
public abstract class AlkoholosItal extends Ital implements Alkoholos {
    
    private String iz;
    private double alkoholTartalom;

    public AlkoholosItal(String iz, double alkoholTartalom) {
        this.iz = iz;
        this.alkoholTartalom = alkoholTartalom;
    }

    @Override
    public String milyenIzu() {
        return this.iz;
    }

    @Override
    public double mennyiAlkoholtTartalmaz() {
        return this.alkoholTartalom;
    }

    @Override
    public String toString() {
        return "Alkoholosital{" + "iz=" + iz + ", alkoholTartalom=" + alkoholTartalom + '}';
    }
    
    
}
