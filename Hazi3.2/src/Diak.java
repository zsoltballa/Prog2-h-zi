/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zsolt
 */
public class Diak {
    private String sajat;
    private String eloz;

    public Diak(String sajat, String eloz) {
        this.sajat = sajat;
        this.eloz = eloz;
    }

    public String getSajat() {
        return sajat;
    }

    public String getEloz() {
        return eloz;
    }

    @Override
    public String toString() {
        return sajat;
    }
    
    
}
