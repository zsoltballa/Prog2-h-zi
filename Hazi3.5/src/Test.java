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
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        boolean r=false;
        int hom=0;
        
        String egy=sc.next();
        
        Telep[] t=new Telep[n];
        
        for(int i=0;i<n;i++)
        {
            String sor=sc.next();
            String[] s=sor.split(":");
            
            Telep ti=new Telep(s[0],Integer.parseInt(s[1]));
            t[i]=ti;
            if(s[0].equals(egy))
            {
                r=true;
                hom=Integer.parseInt(s[1]);
            }
        }
        
        Arrays.sort(t);
        
        if(r)
            for(int i=0;i<n;i++)
                if(hom<t[i].getHo())
                    System.out.println(t[i]);
                
    }
    
}
