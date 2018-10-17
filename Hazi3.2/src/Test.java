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

public class Test {
    public static void drend(Diak[] d)
    {
        for(int i=0; i<d.length-1;i++)
            for(int j=i+1;j<d.length;j++)
                if(d[j].getEloz().equals(d[i].getSajat()) && j>i+1)
                {
                    Diak di=d[i+1];
                    d[i+1]=d[j];
                    d[j]=di;
                }
    }
    
    
    public static void piros(Diak[] d, String nev)
    {
        int piros=0;
        int kek=0;
        
        drend(d);
        
        for(int i=0;i<d.length;i++)
            if(d[i].getSajat().equals(nev))
            {
                System.out.println(piros+" "+kek);
                break;
            }
            else
                { 
                    if(i%2==0)
                        piros++;
                    else
                        kek++;
                }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sor=sc.nextLine();
        String[] s=sor.split(";");
        
        int n=Integer.parseInt(s[0]);
        
        Diak[] d=new Diak[n];
        d[0]=new Diak(s[1],"");
        
        String X=s[2];
        
        for(int i=1;i<n;i++)
        {
            sor=sc.nextLine();
            s=sor.split(";");
            d[i]=new Diak(s[0],s[1]);
        }
        drend(d);
        for(int i=0;i<d.length;i++)
            System.out.println(d[i]);
        
        piros(d,X);
    }
}