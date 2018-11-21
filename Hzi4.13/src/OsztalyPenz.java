/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zsolt
 */
public class OsztalyPenz implements Comparable<OsztalyPenz> {

    private String nev;
    private int penz;

    public OsztalyPenz(String nev, int penz) {
        this.nev = nev;
        this.penz = penz;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getPenz() {
        return penz;
    }

    public void setPenz(int penz) {
        this.penz = penz;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof OsztalyPenz)) {
            return false;
        }
        OsztalyPenz o = (OsztalyPenz) obj;

        return this.nev.equals(o.getNev());
    }

    @Override
    public int compareTo(OsztalyPenz t) {
        if (this.penz == t.getPenz()) {
            return this.nev.compareTo(t.getNev());
        } else {
            return (-1) * Integer.compare(penz, t.getPenz());
        }
    }

    @Override
    public String toString() {
        return this.nev+";"+this.penz;
    }
}
