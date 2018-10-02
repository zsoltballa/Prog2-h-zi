/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazi1.pkg5;

/**
 *
 * @author Zsolt
 */
public class QuadraticEquation {
    private int a;
    private int b;
    private int c;

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
    
    public double getDiscriminant(){
        return b*b-4*a*c;
    }
    
    public double getRoot1(){
        if(getDiscriminant()<0)
            return 0;
        else
            return (-b+Math.sqrt(getDiscriminant()))/2*a;
    }
    
    public double getRoot2(){
        if(getDiscriminant()<0)
            return 0;
        else
            return (-b-Math.sqrt(getDiscriminant()))/2*a;
    }

    @Override
    public String toString() {
        if(getDiscriminant()<0)
            return "The equation has no roots";
        if(getDiscriminant()==0)
            return "The shared root of the equation is "+getRoot1();
        if(getDiscriminant()>0)
            return"The roots of the equation are "+getRoot1()+" and "+getRoot2();
        return "";
    }
    
    
}
