/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zsolt
 */
public class Kiír {
    public static void main(String[] args) {
        Triangle t1= new Triangle("yellow",true);
        
        t1.setSide1(1.0);
        t1.setSide2(1.5);
        t1.setSide3(1.0);
        
        System.out.println("A kerülete="+t1.getPerimeter());
        System.out.println("A területe="+t1.getArea());
        System.out.println("A színe:"+t1.getColor());
        if(t1.isFilled())
            System.out.println("Ki van töltve");
        else
            System.out.println("Nincs kitöltve");
    }
    
}
