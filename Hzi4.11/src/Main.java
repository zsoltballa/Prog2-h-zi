
import java.util.Scanner;

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
    public static void main(String[] args) {
        Szemely sz = new Szemely("Mona Liza", 20, false);
        System.out.println(sz+"\n");
        Hallgato h=new Hallgato("Andras", 34, true, 4);
        System.out.println(h.joE());

        Scanner sc = new Scanner(System.in);
        Szemely[] szemely=new Szemely[4];
        for(int i=0;i<2;i++){
            String sor=sc.nextLine();
            String[] st=sor.split(" ");
            szemely[i]=new Hallgato(st[0], Integer.parseInt(st[1]), Boolean.parseBoolean(st[2]), Double.parseDouble(st[3]));
        }
        for(int i=2;i<4;i++){
            String sor=sc.nextLine();
            String[] st=sor.split(" ");
            szemely[i]=new Oktato(st[0], Integer.parseInt(st[1]), Boolean.parseBoolean(st[2]), st[3]);
        }
                
        for(Szemely i:szemely){
            System.out.println(i);
        }
    }
    
}
