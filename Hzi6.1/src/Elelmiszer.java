/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zsolt
 */
public class Elelmiszer extends Tartos {
    
    private int szavatossag;

    public Elelmiszer(int szavatossag, String nev, String egyseg, int ar) {
        super(nev, egyseg, ar);
        this.szavatossag = szavatossag;
    }

    public int getSzavatossag() {
        return szavatossag;
    }

    public void setSzavatossag(int szavatossag) {
        this.szavatossag = szavatossag;
    }
    
    
}
