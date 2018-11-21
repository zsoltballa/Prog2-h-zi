
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zsolt
 */
public class Test {
    
    public static void kiir(List<Hatizsak> h){
        Collections.sort(h);
        
        for(Hatizsak i : h)
        {
            System.out.println(i);
        }
            
    }
    
    public static void main(String[] args) {
        List<Hatizsak> h = new ArrayList();
        h.add(new Hatizsak("Adidas",150,4,false));
        h.add(new Hatizsak("Nike",120,4,false));
        h.add(new Hatizsak("Eastpack",120,3,false));
        h.add(new Hatizsak("Tamrak",250,10,true));
        h.add(new Hatizsak("Manfrotto",300,13,true));
        h.add(new Hatizsak("Adidas",100,2,false));
        h.add(new Hatizsak("Nike",110,2,false));
        h.add(new Hatizsak("Puma",120,3,false));
        h.add(new Hatizsak("Tamrak",250,15,true));
        h.add(new Hatizsak("Adidas",150,6,false));
        
        
        kiir(h);
    }
}
