
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
        
        Scanner sc=new Scanner(System.in);
        
        String rendsz=sc.nextLine();
        
        Auto a = new Auto(rendsz,100,true);
        
        System.out.println(a);
        
        Auto[] ai = new Auto[4];
        
        for(int i=0; i<4; i++)
        {
            String adat = sc.nextLine();
            
            String[] s = adat.split(" ");
            
            boolean r;
            
            if(s[2].equals("true"))
                r=true;
            else
                r=false;
            
            if(i<2)
            {
                Auto aj = new Auto(s[0],Integer.parseInt(s[1]),r);
                ai[i]=aj;
            }
            else
            {
                Teherauto aj = new Teherauto(s[0],Integer.parseInt(s[1]),r,Integer.parseInt(s[3]));
                ai[i]=aj;
            }
            
            System.out.println(ai[i]);
        }
    }
    
}
