/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zsolt
 */
public class Triangle extends GeometricShape{
        
    private double side1;
    private double side2;
    private double side3;

    public Triangle(String color, boolean filled) {
        super(color, filled);
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    

    public Triangle() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    
    public double getArea(){
        double s=(getPerimeter()/2);
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
    
    public double getPerimeter(){
        return side1+side2+side3;
    }

    @Override
    public String toString() {
        return "Triangle:" + "side1=" + side1 + ", side2=" + side2 + ", side3=" + side3;
    }
    
    
    
}
