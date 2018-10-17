/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zsolt
 */
public class Nyilas extends Katona{
    private int lotav;

    public Nyilas(int lotav) {
        this.lotav = lotav;
    }

    public Nyilas(int lotav, double tamad, double ved) {
        super(tamad, ved);
        this.lotav = lotav;
        super.setTamad((double)lotav+super.getTamad());
    }

    public double getLotav() {
        return lotav;
    }

    public void setLotav(int lotav) {
        this.lotav = lotav;
    }

    @Override
    public String toString() {
        return "TE:[" + super.getTamad() + "]" + " VE:[" + super.getVed() + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Nyilas))
            return false;
            
        Nyilas nyilas = (Nyilas)obj;
        
        if(super.getTamad()==nyilas.getTamad() && super.getVed()==nyilas.getVed() && this.lotav==nyilas.getLotav())
            return true;
        
        return false;
    }   
}