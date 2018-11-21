/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zsolt
 */
public class Hallgato extends Szemely {
    private double atlag;

    public Hallgato(String nev, int eletkor, boolean ferfi,double atlag) {
        super(nev, eletkor, ferfi);
        this.atlag=atlag;
    }

    public double getAtlag() {
        return atlag;
    }

    @Override
    public String toString() {
        return "Hallgato{" + "atlag=" + atlag + '}';
    }

    
    public boolean joE(){
        
        if(this.atlag>=4.0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
    
}
