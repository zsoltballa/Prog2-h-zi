/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zsolt
 */
public class Bor extends AlkoholosItal {
    
    private String szoloFajta;
    private String termoTerulet;

    public Bor(String szoloFajta, String termoTerulet, String i, double a) {
        super(i, a);
        this.szoloFajta = szoloFajta;
        this.termoTerulet = termoTerulet;
    }
    
    public String milyenSzolobolKeszult() {
        return this.szoloFajta;
    }

    @Override
    public String mibolKeszult() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String holTermett() {
        return this.termoTerulet;
    }

    @Override
    public String toString() {
        return "Bor{" + "szoloFajta=" + szoloFajta + ", termoTerulet=" + termoTerulet + '}';
    }
    
    
}
