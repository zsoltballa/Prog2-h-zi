
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class fo implements Comparable<fo>{
    public int irszam;
    public int ossz_ar;
    public List<kicsi> lista;

    public fo(int irszam, int ossz_ar, List<kicsi> lista) {
        this.irszam = irszam;
        this.ossz_ar = ossz_ar;
        this.lista = lista;
    }

    @Override
    public int compareTo(fo o) {
        return Integer.compare(this.irszam, o.irszam); 
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(irszam).append(": ").append(ossz_ar).append(" Ft").append(System.getProperty("line.separator"));
        for(int i=0;i<lista.size();i++)
        {
            sb.append(lista.get(i));
            if(i!=lista.size()-1) sb.append(System.getProperty("line.separator"));
        }
        
        
        return sb.toString();
    }

   
    
    
}
class kicsi implements Comparable<kicsi>{
    public String nev;
    public String telepules;
    public String utca;
    public int hazszam;
    public int csomag_erteke;

    public kicsi(String nev, String telepules, String utca, int hazszam, int csomag_erteke) {
        this.nev = nev;
        this.telepules = telepules;
        this.utca = utca;
        this.hazszam = hazszam;
        this.csomag_erteke = csomag_erteke;
    }

    @Override
    public String toString() {
        return telepules+", "+utca+" "+hazszam+"., "+nev+", "+csomag_erteke+" Ft";
    }

    @Override
    public int compareTo(kicsi o) {
        int diff= this.telepules.compareTo(o.telepules);
        if(diff!=0) return diff;
        
        diff=this.utca.compareTo(o.utca);
        if(diff!=0) return diff;
        
        diff=Integer.compare(this.hazszam, o.hazszam);
        if(diff!=0) return diff;
        
        diff=this.nev.compareTo(o.nev);
        if(diff!=0) return diff;
        
        return Integer.compare(o.csomag_erteke, this.csomag_erteke);
    }
    
    
    
    
}


public class Teszt {
    public static void main(String[] args) {
        String sor;
        String[] token;
        List<fo> folista = new ArrayList<fo>();
        
        try(BufferedReader br = new BufferedReader(new FileReader(args[0]))){
            
            while((sor=br.readLine())!=null)
            {
                int ir_egyezik=0;
                token=sor.split(":");
                
                for (fo x : folista) {
                    if(Integer.parseInt(token[1])==x.irszam)
                    {
                        ir_egyezik=1;
                        x.ossz_ar+=Integer.parseInt(token[5]);
                        
                        x.lista.add(new kicsi(token[0], token[2], token[3], Integer.parseInt(token[4]), Integer.parseInt(token[5])));
                        
                        
                        
                        
                    }
                }
                if(ir_egyezik==0)
                {
                    folista.add(new fo(Integer.parseInt(token[1]), Integer.parseInt(token[5]), null));
                    folista.get(folista.size()-1).lista=new ArrayList<>();
                    folista.get(folista.size()-1).lista.add(new kicsi(token[0], token[2], token[3], Integer.parseInt(token[4]), Integer.parseInt(token[5])));
                }
                
                
                
            }
            
            
        }catch(FileNotFoundException ex){
            System.err.println("Nincs ilyen file!");
        }catch(IOException ex){
            System.err.println("IO hiba!");
        }
        
        for(int i=0;i<folista.size();i++)
        {
            Collections.sort(folista.get(i).lista);
        }
        
        Collections.sort(folista);
        
        for (fo x : folista) {
            System.out.println(x);
        }
    }
}