/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zsolt
 */
public class Gyumolcsle extends Ital{
    
    private Gyumolcs gyl;
    
    public Gyumolcsle(Gyumolcs gy) {
        gyl=gy;
    }
    
    public String mibolFacsartak() {
            return mibolKeszult()+", Viz, Cukor";
    }

    @Override
    public String mibolKeszult() {
        return gyl.milyenFajtaju();
    }

    @Override
    public String milyenIzu() {
        return gyl.milyenFajtaju();
    }

    @Override
    public String toString() {
        return "Gyumolcsle{" + "gyl=" + gyl + '}';
    }
    
    
}
