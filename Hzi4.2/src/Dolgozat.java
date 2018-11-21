
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zsolt
 */
public class Dolgozat {
    public static SzeszesItal[] legmagasabb(Ital[] i){
        int n=0;
        
        SzeszesItal[] ital= new SzeszesItal[]
        {
            new SzeszesItal(0,"","",0),
            new SzeszesItal(0,"","",0),
            new SzeszesItal(0,"","",0)   
        };
        
        for(Ital it: i)
            if(it instanceof SzeszesItal){
                if(n>2)
                    break;
                SzeszesItal ez=(SzeszesItal) it;
                ital[n]=ez;
                n++;
            }
        
        if(n<3)
            return null;
        
        boolean r=true;
        
        for(int j=0;j<i.length;j++)
        {
            if(i[j] instanceof SzeszesItal)
            {
                SzeszesItal szesz=(SzeszesItal) i[j];
                for(int k=0;k<3;k++)
                    if(szesz.getAlkoholTartalom()>ital[k].getAlkoholTartalom()){
                        for(int m=0;m<3;m++)
                            if(szesz.equals(ital[m]))
                                r=false;
                            if(r)
                            {
                                ital[k]=szesz;
                                j=0;
                                r=true;
                                break;
                            }
                            r=true;
                    }
            }
        }
        
        return ital;
    }
    
    public static void main(String[] args) {
        Ital[] i=new Ital[] {
            new Ital("Coca Cola","150ml",300),
            new Ital("Fanta","150ml",270),
            new Ital("Tonic","150ml",320),
            new SzeszesItal(5,"Paulaner","500 ml",450),
            new SzeszesItal(6,"Csiki","500 ml",350),
            new SzeszesItal(4,"Borsodi","500ml",300),
            new SzeszesItal(5,"Heineken","450 ml",370)
        };
        
        SzeszesItal[] szeszes=legmagasabb(i);
        
        for(SzeszesItal sz: szeszes)
            System.out.println(sz);
        
        Arrays.sort(szeszes);
        
        for(SzeszesItal sz: szeszes)
            System.out.println(sz);
    }
            
    
}
