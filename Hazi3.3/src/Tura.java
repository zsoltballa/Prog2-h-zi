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

public class Tura implements Comparable<Tura> {
    private int ev;
    private int ho;
    private int nap;
    private String neve;
    private int tav;

    public Tura(int ev, int ho, int nap, String neve, int tav) {
        this.ev = ev;
        this.ho = ho;
        this.nap = nap;
        this.neve = neve;
        this.tav = tav;
    }

    @Override
    public String toString() {
        return ev + ";" + ho + ";" + nap + ";" + neve;
    }

    public int getTav() {
        return tav;
    }
    
    @Override
    
    public int compareTo(Tura o) {
        int diff = Integer.compare(o.ev, this.ev);
        if (diff != 0) {
            return -diff;
        }
        diff = Integer.compare(o.ho, this.ho);
        if (diff != 0) {
            return -diff;
        }
        diff = Integer.compare(o.nap, this.nap);
        if (diff != 0) {
            return -diff;
        }
        return (neve.compareTo(o.neve));
    }
    
}
