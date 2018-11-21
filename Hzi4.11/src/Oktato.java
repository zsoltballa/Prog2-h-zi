/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zsolt
 */
public class Oktato extends Szemely{
    private String tanszek;

    public Oktato( String nev, int eletkor, boolean ferfi,String tanszek) {
        super(nev, eletkor, ferfi);
        this.tanszek = tanszek;
    }

    public String getTanszek() {
        return tanszek;
    }
    
}
