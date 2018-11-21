/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zh;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Zsolt
 */
public class Hallgato {
    
    private int mennyitKeszult;
    private boolean sokatTanult;

    public Hallgato(int mennyitKeszult, boolean sokatTanult) {
        this.mennyitKeszult = mennyitKeszult;
        this.sokatTanult = sokatTanult;
    }
    
    public Dolgozat dolgozatotIr()
    {
        int randNum=ThreadLocalRandom.current().nextInt(0,51);
        randNum=randNum*this.mennyitKeszult;
        if(randNum==1)
        {
            Dolgozat d=new Dolgozat(-1);
            return d;
        }
            
        if(this.sokatTanult)
        {
            randNum=ThreadLocalRandom.current().nextInt(4,8);
            randNum=randNum*this.mennyitKeszult;
            Dolgozat d=new Dolgozat(randNum);
            return d;
        }
        
        randNum=ThreadLocalRandom.current().nextInt(0,6);
        randNum=randNum*this.mennyitKeszult;
        Dolgozat d=new Dolgozat(randNum);
        return d;
    }
    
}
