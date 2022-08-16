import java.util.*;

public class Method{
          
     
     int max(int x, int y) {
          if(x>y) 
             return x;
          else 
             return y;  
     }

       
     static void inc(int x){
          x++;
          System.out.println(x);
     }

    
    //Method Overloading
     static int bignum(int a,int b)
    {
        return a>b?a:b;
    }
    
     static int bignum(int a,int b,int c)
    {
        if(a>b && a>c) return a;
        else if(b>c) return b;
        return c;
    }





      public static void main(String[] args){
          //Call Method without Static through Object
             int a=52,b=96;
             Method maxi = new Method();
             System.out.println(maxi.max(a,b));
              
          //Method Overloading
            
           System.out.println( bignum(10,5));
           System.out.println(bignum(10,15,5));

              
          }
          }