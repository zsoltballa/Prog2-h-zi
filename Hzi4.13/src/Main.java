
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
        List<OsztalyPenz> li = new ArrayList();
        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();

        while (sor.length()>0) {
            String st[] = sor.split(";");
            String nev = st[0];
            int penz = Integer.parseInt(st[1]);
            boolean b = false;

            if (li.size() == 0) {
                li.add(new OsztalyPenz(nev, penz));
                b = true;
            } else {
                for (int i = 0; i < li.size(); i++) {
                    if (nev.equals(li.get(i).getNev())) {
                        int vpenz = li.get(i).getPenz() + penz;
                        li.set(i, new OsztalyPenz(nev, vpenz));
                        b = true;
                    }
                }
            }
            if (!b) {
                li.add(new OsztalyPenz(nev, penz));
                b = false;
            }
            sor = sc.nextLine();
        }

        Collections.sort(li);
        for (OsztalyPenz i : li) {
            System.out.println(i);
        }

    }

}
