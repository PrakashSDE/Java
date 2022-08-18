 import java.util.*;
 
 class Outer{

    static int x=10;
    Inner i=new Inner();
    
    public void outerDisplay(){
        i.innerDisplay();
        System.out.println(i.y);   
    }


   class Inner{
        int y=20;
     public void innerDisplay(){
            System.out.println(x+" "+y);
        }
    }
}

public class Inner_Class{

    public static void main(String[] args) {

        Outer.Inner oi=new Outer().new Inner();
        oi.innerDisplay();
        
    }
    
}