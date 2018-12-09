
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
    
        List <Resztvevo> l = new ArrayList<>();
    
            try
            {
                FileReader fr = new FileReader(new File("sample.txt"));
                BufferedReader br = new BufferedReader(fr);
                
                String sor;
                
                Resztvevo r;
                
                while((sor=br.readLine())!=null)
                {
                    String[] resz=sor.split(":-");
                    r = new Resztvevo(resz[0],resz[1],resz[2]);
                    l.add(r);
                }
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
            
            for(Resztvevo r:l)
            {
                
            }
            
        }
}
