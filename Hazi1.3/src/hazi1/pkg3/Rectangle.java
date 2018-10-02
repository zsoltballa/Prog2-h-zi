/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazi1.pkg3;

/**
 *
 * @author Zsolt
 */
public class Rectangle {
    public double width=1.0;
    public double height=1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public double getArea(){
        return 2*this.height+2*this.width;
    }
    
    public double getPerimeter(){
        return this.height*this.width;
    }

    @Override
    public String toString() {
        return "Rectangle,\n" + "Szélessége=" + width + "\nMagassága=" + height + "\nTerülete="+getArea()+"\nKerülete="+getPerimeter()+"\n";
    }
    
    
}
