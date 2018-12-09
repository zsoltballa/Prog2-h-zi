
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
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
public class Main {
    
    public static void main(String[] args) {
        List <Ceg> l = new ArrayList<>();
    
        try
        {
            FileReader fr = new FileReader(new File("sample.txt"));
            BufferedReader br = new BufferedReader(fr);
            
            String sor;
            Ceg c;
            
            while((sor=br.readLine())!=null)
            {
                boolean r=false;
                String[] resz=sor.split(":");
                if(l.isEmpty())
                {
                    c = new Ceg(resz[0],resz[1],Integer.parseInt(resz[2]),Integer.parseInt(resz[3]));
                    l.add(c);
                }
                else
                {
                    for(Ceg i:l)
                    {
                        if(i.getNev().equals(resz[0]) && i.getTelep().equals(resz[1]))
                        {
                            r=true;
                            c = new Ceg(resz[0],resz[1],Integer.parseInt(resz[2]),Integer.parseInt(resz[3])+1);
                            l.set(l.indexOf(i),c);
                        }
                    }
                    if(!r)
                    {
                        c = new Ceg(resz[0],resz[1],Integer.parseInt(resz[2]),Integer.parseInt(resz[3]));
                        l.add(c);
                    }
                }
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        
        Collections.sort(l);
        
        for(Ceg i:l)
            System.out.println(l);
    
    }
}
