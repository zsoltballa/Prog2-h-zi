/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zsolt
 */
public class Teszt {
    public static Katona megkuzd(Katona egy, Katona ketto){
        if((egy.getTamad()-ketto.getVed())>(ketto.getTamad()-egy.getVed()))
        {
            System.out.println("A " + egy.toString() + "katona küzdött a " + ketto.toString() + " katonával és az elso nyert");    
            return egy;
        }
        if((egy.getTamad()-ketto.getVed())==(ketto.getTamad()-egy.getVed()))
        {
            System.out.println("A " + egy.toString() + "katona küzdött a " + ketto.toString() + " katonával és az elso nyert");    
            return egy;
        }
        System.out.println("A " + egy.toString() + "katona küzdött a " + ketto.toString() + " katonával és a masodik nyert"); 
        return ketto;
    }
    
    public static void main(String[] args) {
        Katona[] katona=new Katona[]{
            new Nyilas(20,20,20),
            new Nyilas(15,30,20),
            new Landzsas(65,70)
        };
        
        System.out.println(megkuzd(megkuzd(katona[0],katona[1]),katona[2]) + " Nyert");
    }
}
