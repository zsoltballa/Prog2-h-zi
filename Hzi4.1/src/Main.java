/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zsolt
 */
public class Main {
    
    public static Bor[] isAszu(Bor[] b){
        
        int n=0;
        
        for(Bor bi: b){
            if(bi instanceof Aszu)
            {
                Aszu a = (Aszu) bi;;
                if(a.hanyPuttonyos()==5)
                    n++;
            }
        }
        
        System.out.println(n);
        
        Bor[] bn=new Bor[n];
        
        n=0;
        
        for(Bor bi: b){
            if(bi instanceof Aszu)
            {
                Aszu a;
                a=(Aszu) bi;
                if(a.hanyPuttonyos()==5)
                {
                    bn[n]=bi;
                    n++;
                }
            }
        }
        
        return bn;
    }
    
    public static void main(String[] args) {
        Bor[] b=new Bor[]{
            new Bor("Rizling","Tokaj","Szaraz",12),
            new Bor("Bianca","Olaszliszka","Edes",12.3),
            new Bor("Leanyka","Badacsony","Felszaraz",11.8),
            new Aszu(4,"Edes",16),
            new Aszu(6,"Edes",16),
            new Aszu(5,"Edes",14.8),
            new Aszu(5,"Edes",15.2)
        };
        
        Bor [] bor=isAszu(b);
        
        System.out.println("123");
        
        for(Bor bi: bor)
            System.out.println(bi);
            
    }
    
}
