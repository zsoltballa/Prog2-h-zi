/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kemia;

/**
 *
 * @author Zsolt
 */
public final class NemesGaz extends KemiaiElem {
    
    public NemesGaz(String vegyjel, String rendszam, int focsoport) {
        super(vegyjel, rendszam, focsoport);
        if(focsoport==8)
            throw new ArithmeticException("Nem nemes gaz"); 
    }
    
}
