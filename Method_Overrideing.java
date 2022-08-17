import java.util.*;

class base{
    public void display(){
        System.out.println("Display from base class");
    }
}

class derive extends base{
    public void display(){
        System.out.println("Display from derive class");
    }
}




//Dynamic method Dispatch
class Super{

    public void method1(){
        System.out.println("Super Method1");
    }
    
    public void method2(){
        System.out.println("Super Method2");
    }
}

class Sub extends Super{
    @Override

    public void method2(){
        System.err.println("Sub Method2");
    }
    
    public void method3(){
        System.out.println("Sub Method3");
    }
}



public class Method_Overrideing {
      public static void main(String[] args){
            //Method Overrideing
            derive obj1=new derive();
            //base class reference but derive class object;
            base obj2=new derive();
           // derive obj3=new base(); it is not applicable

            obj1.display();
            obj2.display();

            //Dynamic Method Dispatch
            Super ref=new Sub();
            ref.method2(); //Override method will called
           // ref.method3(); is not applicable

          }
          }