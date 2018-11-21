
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zsolt
 */
public class Auto implements Comparable<Auto>{
    
    private String rendszam;
    private int teljesitmeny;
    private boolean automata;

    public Auto(String rendszam, int teljesitmeny, boolean automata) {
        this.rendszam = rendszam;
        this.teljesitmeny = teljesitmeny;
        this.automata = automata;
    }

    public String getRendszam() {
        return rendszam;
    }

    public int getTeljesitmeny() {
        return teljesitmeny;
    }

    public boolean isAutomata() {
        return automata;
    }

    @Override
    public String toString() {
        return "Auto{" + "rendszam=" + rendszam + ", teljesitmeny=" + teljesitmeny + ", automata=" + automata + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Auto) || obj==null)
            return false;
        
        Auto a = (Auto) obj;
        
        if(a.rendszam.equals(this.rendszam))
            return true;
        
        return false;
    }

    @Override
    public int compareTo(Auto o) {
        return Integer.compare(this.teljesitmeny, o.teljesitmeny);
    }
    
    
    
}
