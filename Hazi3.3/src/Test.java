/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zsolt
 */
import java.util.Scanner;
import java.util.Arrays;

public class Test {
    
    public static void kiir(Tura [] t, int m)
    {
        for(int i=0;i<t.length;i++)
            if(t[i].getTav()==m)
                System.out.println(t[i]);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        Tura[] t=new Tura[n];
        
        int max=0;
        
        for(int j=0;j<n;j++)
        {
            String sor=sc.next();
            
            String[] s=sor.split(";");

            int x=0;
            
            for(int k=4;k<s.length;k++)
                x+=Integer.parseInt(s[k]);
            
            Tura ti=new Tura(Integer.parseInt(s[0]),Integer.parseInt(s[1]),Integer.parseInt(s[2]),s[3],x);
            
            t[j]=ti;
            
            if(max<x)
                max=x;
        }
        
        Arrays.sort(t);
        
        kiir(t,max);
        
    }
    
}
