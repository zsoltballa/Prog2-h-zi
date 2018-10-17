/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zsolt
 */
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        Szo[] sz=new Szo[n];
        
        for(int i=0;i<n;i++)
        {
            String sor=sc.next();
            String[] s=sor.split(":");
            
            Szo szi=new Szo(s[0],s[1]);
            sz[i]=szi;
        }
        
        Arrays.sort(sz);
        
        System.out.println("\n");
        
        for(int i=0;i<n;i++)
            System.out.println(sz[i]);
    }
    
}
