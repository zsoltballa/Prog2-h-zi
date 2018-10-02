/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazi2;

/**
 *
 * @author Zsolt
 */
public class Metódusok {
    
    public static void main(String[] args) {
        getSorrend(3,1,2);
        
        getMin(-6,-4,8);
        
        Kiir(4,5,2,3);
        
        if(Hszog(1,1,3))
            System.out.println("Képezhetnek háromszöget\n");
        else
            System.out.println("Nem képezhetnek háromszöget\n");
        
        System.out.println("A két év között "+Ev(1990,2020)+" szökőév van\n");
        
        Doga(3);
        
        System.out.println(Osztás(50,3)+"\n");
        
        System.out.println("A szám prím?\n"+Prím_1(8)+"\n");
        
        Fibonacci(8);
        
        System.out.println("A szám fordítottja:"+Fordított(123)+"\n");
        
        System.out.println("A szám faktoriálisa="+Fakt(4)+"\n");
        
        Között(2,40,4);
        
        System.out.println("A legkisebb Fibonacci szám, ami nagyobb mint a választott számunk="+Fibonacci2(5)+"\n");
        
        Köb();
    }
        
    static void getSorrend(int a, int b, int c){
            int n=a;
            
            if(a>c){
                n=a;
                a=c;
                c=n;
            }
            
            if(a>b){
                n=a;
                a=b;
                b=n;
            }
            
            if(b>c){
                n=b;
                b=c;
                c=n;
            }
            
            System.out.println(a+", "+b+", "+c+"\n");
    }
    
    static void getMin(int a, int b, int c){
        int min=a;
        int max;
        
        if(min>b)
            min=b;
        
        if(min>c)
            min=c;
        
        if(a<0)
            a=a*(-1);
        
        if(b<0)
            b=b*(-1);
        
        if(c<0)
            c=c*(-1);
        
        max=a;
        
        if(max<b)
            max=b;
        
        if(max<c)
            max=c;
        
        System.out.println("A minimum="+min+"\nAz abszolút értékek maximuma="+max+"\n");
    }
    
    static void Kiir(int a, int b, int c, int d){
        
        System.out.println(a+", "+b+", "+c+", "+d);
        
        if(d>=0)
            System.out.println(a+", "+c+", "+b+", "+d+"\n");
        else
            System.out.println(a+", "+b+", "+d+", "+c+"\n");
    }
    
    static boolean Hszog(int a, int b, int c){
        
        if(a+b<c || a+c<b || b+c<a)
            return true;
        else 
            return false;
    }
    
    static int Ev(int a, int b){
        int min=a;
        int max=b;
        int count=0;
        
        if(min>b){
            min=b;
            max=a;
        }
        
        while(min<max){
            if(max%4==0 && max%100!=0)
                count++;
            max--;
        }
        
        return count;
        
    }
    
    static void Doga(int a){
        
        switch(a){
            case 1:System.out.println("Elégtelen\n");
                    break;
            case 2:System.out.println("Elégséges\n");
                    break;
            case 3:System.out.println("Jó\n");
                    break;
            case 4:System.out.println("Jeles\n");
                    break;
            case 5:System.out.println("Kitűnő\n");
                    break;
        }
    }
    
    static int Osztás(int a, int b){
        int hanyados=0;
        
        while(a>=b){
            hanyados++;
            a=a-b;
        }
            
        return hanyados;
    }
    
    static boolean Prím_1(int n){
        int osztók_száma=0;
        
        for(int osztó=1;osztó<=n;osztó++)
            if(n%osztó==0)
                osztók_száma++;
            if(osztók_száma==2)
                return true;
            else
                return false;
    }
    
    static void Fibonacci(int n){
        int a=1;
        int b=0;
        
        System.out.println("Az első "+n+" Fibonacci szám:");
        
        for(int k=1;k<=n;k++){
            System.out.println(b);
            b+=a;
            a=b-a;
        }
        System.out.println("\n");
    }
    
    static int Fordított(int n){
        int új=0;
        
        while (n!=0){
            új=új*10+n%10;
            n=n/10;
        }
        return új;
    }
    
    static long Fakt(int n){
        long fakt=1;
        
        for(int i=1;i<=n;i++)
            fakt=fakt*i;
        
        return fakt;
    }
    
    static void Között(int n, int m, int k){
        
        for(int i=n;i<=m;i++){
            if(i%k==0)
                System.out.println(i);
        }
        System.out.println("\n");
    }
    
    static int Fibonacci2(int n){
        int a=1;
        int b=0;
        
        while(b<=n){
            b+=a;
            a=b-a;
        }
        return b;
    }
    
    static void Köb(){
        int i=0;
        
        while(i!=1000){
            int j=i;
            int uj=0;
            while(j!=0){
                uj=uj+(j%10)*(j%10)*(j%10);
                j=j/10;
            }
            if(i==uj)
                System.out.println(uj);
            i++;
    }
    }
}
