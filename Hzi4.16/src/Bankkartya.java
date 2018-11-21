
import java.util.ArrayList;
import java.util.List;
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
public class Bankkartya {

    public static void main(String[] args) {
        List<Integer> li = new ArrayList();
        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();
        while (sor.length() > 0) {
            for (int i = 0; i < sor.length(); i++) {
                int szam = Integer.parseInt(""+sor.charAt(i));
                li.add(szam);
            }
        }
            boolean paros = true;
            int osszeg = 0;
            for (Integer i : li) {
                if (paros) {
                    i = 2 * i;
                    if (i > 9) {
                        i -= 9;
                    }
                }
                osszeg += i;
                paros = !paros;
            }
            
            if (osszeg % 10 == 0) {
                System.out.println("YES");
            } 
            else 
            {
                System.out.println("No");
            }
            sor = sc.nextLine();
        }

}
