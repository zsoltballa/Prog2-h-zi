/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazi1.pkg4;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Zsolt
 */
public class Ital {
    protected String név;
    protected String kiszerelés;
    private static int ár=10;
    protected Date gyártásiDátum;
    
    public Ital(String név, String kiszerelés) {
        this.név = név;
        this.kiszerelés = kiszerelés;
        this.gyártásiDátum = new Date();
    }
    
    public static void setÁr(int ár) {
        Ital.ár = ár;
    }
    
    

    public String getNév() {
        return név;
    }

    public String getKiszerelés() {
        return kiszerelés;
    }

    public static int getÁr() {
        return ár;
    }

    public Date getGyártásiDátum() {
        return gyártásiDátum;
    }

    @Override
    public String toString() {
        return név+", "+kiszerelés+", "+ár;
    }
    
    public double getÁrEuróban(){
        return this.ár/320;
    }
    
    @Override
    public boolean equals(Object obj) {
        
        if (obj == null || !(obj instanceof Ital)) {
            return false;
        }
        
        Ital i=(Ital)obj;
        
        return this.getKiszerelés().equals(i.getKiszerelés()) && this.getNév().equals(i.getNév()) && this.getÁr()==i.getÁr();
    }   
}
