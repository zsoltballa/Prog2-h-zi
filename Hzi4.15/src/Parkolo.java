
import java.util.ArrayList;
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
public class Parkolo implements Comparable<Parkolo> {

    private String cim;
    private double terulet;
    private int kapacitas;
    private List<String> rendszam = new ArrayList();

    public Parkolo(String cim, double terulet, int kapacitas, List<String> rendszam) {
        this.cim = cim;
        this.terulet = terulet;
        this.kapacitas = kapacitas;
        this.rendszam = rendszam;

    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public double getTerulet() {
        return terulet;
    }

    public void setTerulet(double terulet) {
        this.terulet = terulet;
    }

    public int getKapacitas() {
        return kapacitas;
    }

    public void setKapacitas(int kapacitas) {
        this.kapacitas = kapacitas;
    }

    public List<String> getRendszam() {
        return rendszam;
    }

    public void setRendszam(List<String> rendszam) {
        this.rendszam = rendszam;
    }

    public int getSzabadHely() {
        return this.kapacitas - rendszam.size();
    }

    @Override
    public String toString() {

        return this.cim + ": " + this.getSzabadHely() + " szabad hely";

    }

    @Override
    public int compareTo(Parkolo t) {

        if (this.getSzabadHely() == t.getSzabadHely()) {
            return this.cim.compareTo(t.getCim());
        } else {
            return (-1) * Integer.compare(this.getSzabadHely(), t.getSzabadHely());
        }
    }   
}
