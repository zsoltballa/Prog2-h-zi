/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zsolt
 */
public class Test {
    
    
    
    public static void main(String[] args) {
        Autó[] autó = new Autó[]{
            new Teherautó("JAM471", 200, 2000),
            new Teherautó("ASK817", 600, 20000),
            new Teherautó("WEF987", 550, 16000),
            new Teherautó("UEW611", 400, 12000),
            new Teherautó("UEG231", 650, 25000),
            new Autó("DVI123", 1500),
            new Autó("OKZ923", 180),
            new Autó("VMR034", 75),
            new Autó("BEV086", 114),
            new Autó("GWE235", 150),
        };

        Teherautó[] teherautó = new Teherautó[]{
            new Teherautó("SDF345", 500, 14000),
            new Teherautó("ANL123", 300, 10000),
            new Teherautó("TBS231", 400, 12000),
            new Teherautó("TBA230", 200, 2000),
            new Teherautó("FGA542", 400, 13000),
            new Teherautó("GSD013", 400, 13000),
            new Teherautó("MMT234", 650, 24000),
            new Teherautó("UZI569", 800, 25000),
            new Teherautó("RNT456", 600, 20000),
            new Teherautó("RNT678", 550, 18000),
        };
        
        maxSzállíthatóTeherCsökkenőleg(teherautó);
        System.out.println("\nA legerősebb autó:"+maxMotorTeljesítmény(autó));
    }
    
    public static void maxSzállíthatóTeherCsökkenőleg(Teherautó [] teher){
        for(int i=0;i<teher.length;i++)
        {
            for(int j=i+1;j<teher.length;j++)
            {
                if(teher[i].getMaxSzállíthatóTeher() < teher[j].getMaxSzállíthatóTeher()){
                    Teherautó t=teher[i];
                    teher[i]=teher[j];
                    teher[j]=t;
                }    
            }
            System.out.println(teher[i]);
        }
    }
    
    public static Autó maxMotorTeljesítmény(Autó [] autó){
        
        int max=0;
        int ind=0;
        
        for(int i=0;i<autó.length-1;i++)
        {
            if(autó[i].getMotorTeljesítmény()>max)
            {
                max=autó[i].getMotorTeljesítmény();
                ind=i;
            }
        }
        return autó[ind];
    }
    
    
}
