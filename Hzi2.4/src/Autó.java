/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zsolt
 */
import java.util.Date;

public class Autó {
    private String rendszám;
    private int motorTeljesítmény;
    private Date gyártásDátuma;

    public Autó(String rendszám, int motorTeljesítmény) {
        this.rendszám = rendszám;
        this.motorTeljesítmény = motorTeljesítmény;
        this.gyártásDátuma=new Date();
    }

    public String getRendszám() {
        return rendszám;
    }

    public void setRendszám(String rendszám) {
        this.rendszám = rendszám;
    }

    public int getMotorTeljesítmény() {
        return motorTeljesítmény;
    }
    
    public Date getGyártásDátuma() {
        return gyártásDátuma;
    }

    @Override
    public String toString() {
        return "Aut\u00f3{" + "rendsz\u00e1m=" + rendszám + ", motorteljes\u00edtm\u00e9ny=" + motorTeljesítmény + ", gy\u00e1rt\u00e1sD\u00e1tuma=" + gyártásDátuma + '}';
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Autó)) {
            return false;
        }
        
        Autó a=(Autó)obj;
        
        return this.rendszám.equals(a.getRendszám()) && this.motorTeljesítmény==a.getMotorTeljesítmény();
    }
    
    
    
}
