
import java.util.ArrayList;
import java.util.Collections;
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
public class Main {

    public static void main(String[] args) {
        List<Parkolo> li = new ArrayList();
        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();

        while (sor.length() > 0) {
            String st[] = sor.split(";");
            String cÃ­m = st[0];//1
            double terulet = Double.parseDouble(st[1]);//2
            int t = Integer.parseInt(st[2]);//3
            List<String> li2 = new ArrayList();
            for (int i = 3; i < st.length; i++) {
                li2.add(st[i]);
            }

            li.add(new Parkolo(cÃ­m, terulet, t, li2));

            sor = sc.nextLine();

        }
        Collections.sort(li);
        for (Parkolo i : li) {
            if(i.getSzabadHely()>=3){
                System.out.println(i);
            }
        }

    }   
}
