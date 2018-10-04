/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazi1.pkg4;

/**
 *
 * @author Zsolt
 */
public class Hazi14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ital i1=new Ital("Fanta","nagy");
        Ital i2=new Ital("Coca Cola","nagy");
        if(i1.equals(i2))
            System.out.println("Ugyanazok");
        else
            System.out.println("Nem ugyanazok");
    }
    
}
