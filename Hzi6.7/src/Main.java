
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        
        List <Szemely> l = new ArrayList<>();
        List <Alap> a = new ArrayList<>();
    
            try
            {
                FileReader fr = new FileReader(new File("sample.txt"));
                BufferedReader br = new BufferedReader(fr);
                
                String sor;
                List<Rendeles> r = new ArrayList<>();
                Szemely s;
                Rendeles ri;
                
                
                while((sor=br.readLine())!=null)
                {
                    String[] resz=sor.split(";");
                    String[] res=resz[2].split(",");
                    for(String st:res)
                    {
                        ri = new Rendeles(st);
                        r.add(ri);
                    }
                    
                    s = new Szemely(resz[0],r);
                    l.add(s);
                }
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
            
            Scanner sc = new Scanner(System.in);
            String in;
            
            while((in=sc.next())!=null)
            {
                String[] i = in.split(";");
                Alap ai = new Alap(i[0],Integer.parseInt(i[1]));
                a.add(ai);
            }
            
            int counter=0;
            boolean r;
            int ar=0;
            
            for (int i = 0; i < l.size(); i++) 
            {
                r=true;
                for(Alap al: a)
                {
                    if(!l.get(i).getRendel().contains(al))
                    {
                        r=false;
                        break;
                    }
                    ar+=al.getAr();
                }
                if(r)
                {
                    counter++;
                }
                
            }
            
            System.out.println(counter);
            System.out.println(ar);
                    
    }
    
}
