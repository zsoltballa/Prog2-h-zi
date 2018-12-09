
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zsolt
 */
public class Szemely {
    
    private String nev;
    private List<Rendeles> rendel;

    public Szemely(String nev, List<Rendeles> rendel) {
        this.nev = nev;
        this.rendel = rendel;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public List<Rendeles> getRendel() {
        return rendel;
    }

    public void setRendel(List<Rendeles> rendel) {
        this.rendel = rendel;
    }
    
    
    
}
