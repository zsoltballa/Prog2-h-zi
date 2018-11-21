/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zh;

import java.util.Scanner;

/**
 *
 * @author Zsolt
 */
public class Main {
    public static void main(String[] args) {
        Hallgato[] hl;
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        hl = new Hallgato[n];
        
        for(int i=0;i<n;i++)
        {
            String s=sc.next();
            String[] sp=s.split(",");
            
            int szam=Integer.parseInt(sp[0]);
            boolean r;
            if(sp[1].equals("igaz"))
                r=true;
            else
                r=false;
            Hallgato hli=new Hallgato(szam,r);
            hl[i]=hli;
        }
        
        for(int i=0;i<n;i++)
        {
            boolean ri=hl[i].dolgozatotIr().megfelelt();
            boolean r=hl[i].dolgozatotIr().megfelelt();
            
            if(r && ri)
                System.out.println("megfelelt");
            else
                System.out.println("nem felelt meg");
        }
    }
}
