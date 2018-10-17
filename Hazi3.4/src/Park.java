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

public class Park implements Comparable<Park> {
    private String neve;
    private String tema;
    private int magas;
    private int ido;

    public Park(String neve, String tema, int magas, int ido) {
        this.neve = neve;
        this.tema = tema;
        this.magas = magas;
        this.ido = ido;
    }

    @Override
    public String toString() {
        return neve + "(" + tema + "):" + ido;
    }
    
    @Override
    public int compareTo(Park p)
    {
        int diff=Integer.compare(p.ido, this.ido);
        if(diff!=0)
            return -diff;
        
        diff=Integer.compare(p.magas, this.magas);
        if(diff!=0)
            return diff;
        
        return (neve.compareTo(p.neve));
    }
    
}
