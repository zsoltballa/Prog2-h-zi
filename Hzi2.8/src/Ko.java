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
import java.util.Random;

public class Ko {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String test;
        do{
            test=sc.nextLine();
            if(test.equals("Ko"))
                break;
            if(test.equals("Papir"))
                break;
            if(test.equals("Ollo"))
                break;
            if(test.equals("Vege"))
                break;
        }while(true);
        
        if(test.equals("Vege"))
            System.out.println("Vege");
        else
        {
            Random rnd=new Random();
            int i=rnd.nextInt(3);

            if(i==0)
            {
                if(test.equals("Ko"))
                    System.out.println("Dontetlen");
                if(test.equals("Papir"))
                    System.out.println("Nyertel");
                if(test.equals("Ollo"))
                    System.out.println("Vesztettel");
            }

            if(i==1)
            {
                if(test.equals("Ko"))
                    System.out.println("Vesztettel");
                if(test.equals("Papir"))
                    System.out.println("Dontetlen");
                if(test.equals("Ollo"))
                    System.out.println("Nyertel");
            }

            if(i==2)
            {
                if(test.equals("Ko"))
                    System.out.println("Nyertel");
                if(test.equals("Papir"))
                    System.out.println("Vesztettel");
                if(test.equals("Ollo"))
                    System.out.println("Dontetlen");
            }
    }
    }
}
