/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazi1.pkg1;

/**
 *
 * @author Zsolt
 */
public class Hazi11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pont p1 = new Pont(1.2,3.5);
        Pont p2 = new Pont(1.5,2.5);
        Pont p3 = new Pont(4.2,2.2);
        Pont p4 = new Pont(3.0,1.0);
        
        p1.setY(p1.getY()+5);
        System.out.println(p1.getY());
        
        
        p2.setY(p2.getY()+5);
        System.out.println(p2.getY());
        
        p3.setX(p3.getX()-3.4);
        System.out.println(p3.getX());
        
        p4.setX(p4.getX()-3.4);
        System.out.println(p4.getX());
    }
    
}
