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
        
        Park[] p=new Park[n];
        
        for(int i=0;i<n;i++)
        {
            String sor=sc.next();
            String[] s=sor.split(";");
            
            Park pi=new Park(s[0],s[1],Integer.parseInt(s[2]),Integer.parseInt(s[3]));
            p[i]=pi;
        }
        
        Arrays.sort(p);
        
        for(int i=0;i<n;i++)
            System.out.println(p[i]);
    }
}
