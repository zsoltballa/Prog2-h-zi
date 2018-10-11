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
    public static void main(String[] args) {
        VendéglátóipariEgység[] egys=new VendéglátóipariEgység[]{
            new Étterem("Nagy",100,new String []{"Húsleves"}),
            new Étterem("Kicsi",10,new String []{"Gulyás"}),
            new Étterem("Közepes",50,new String []{"Bab"}),
            new Étterem("Messzi",40,new String []{"Rántott hús"}),
            new Étterem("Közeli",45,new String []{"Fény"}),
            new Kocsma("Kultúr",50, new String []{"Világos","Barna"}),
            new Kocsma("Sánci",65,new String []{"Barna","Árpa"}),
            new Kocsma("Zimmer",45,new String []{"Szűretlen","Búza"}),
            new Kocsma("Frei",70,new String []{"Búza","Barna","Világos"}),
            new Kocsma("Központ",60,new String []{"Árpa","Barna","Szűretlen"})
        };
        
        Kocsma [] kocsma=adottItaltKínálóKocsmák("Világos", egys);
        
        for(int i=0;i<kocsma.length;i++)
            if(kocsma[i]!=null)
                System.out.println(kocsma[i].getNév());
    }
    
    public static Kocsma[] adottItaltKínálóKocsmák(String ital, VendéglátóipariEgység[] t)
    {
        int j=0;
        Kocsma k1;

        for(int i=0;i<t.length;i++){
            if(t[i] instanceof Kocsma){
                k1=(Kocsma) t[i];
                for(int l=0;l<k1.getSörlap().length;l++)
                if(k1.getSörlap()[l].equals(ital))
                {
                    j++;
                }
            }
        }
        Kocsma [] k=new Kocsma[j];
        j=0;
        for(int i=0;i<t.length;i++){
            if(t[i] instanceof Kocsma){
                k1=(Kocsma) t[i];
                for(int l=0;l<k1.getSörlap().length;l++)
                if(k1.getSörlap()[l].equals(ital))
                {
                    k[j]=k1;
                    j++;
                }
            }
        }
        
        return k;
    }
}
