/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazi1.pkg6;

/**
 *
 * @author Zsolt
 */
public class Hazi16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinearEquation l1=new LinearEquation(1,1,1,1,1,1);
        LinearEquation l2=new LinearEquation(1,2,3,4,5,6);
        LinearEquation l3=new LinearEquation(5,2,6,3,4,1);
        
        if(l1.isSolvable())
            System.out.println("A megoldás:\nx="+l1.getX()+"\ny="+l1.getY()+"\n");
        else
            System.out.println("The equation has no roots\n");
        
        if(l2.isSolvable())
            System.out.println("A megoldás:\nx="+l2.getX()+"\ny="+l2.getY()+"\n");
        else
            System.out.println("The equation has no roots\n");
        
        if(l3.isSolvable())
            System.out.println("A megoldás:\nx="+l3.getX()+"\ny="+l3.getY()+"\n");
        else
            System.out.println("The equation has no roots\n");
    }
    
}
