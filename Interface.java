import java.util.*;

interface Test1{
    final static int X=10;
    public abstract void meth1();
    public abstract void meth2();
    default void meth3(){
        System.out.println("Meth3 of Test");
    }
}

interface Test2 extends Test1{
    void meth4();
}

interface Test3{
    void meth5();
}

class My implements Test2,Test3
{
    public void meth1(){System.out.println("Meth1");}
    public void meth2(){System.out.println("Meth2");}
    public void meth4(){System.out.println("Meth4");}
    public void meth5(){System.out.println("Meth5");}
}

public class Interface{
      public static void main(String[] args){
           My ref=new My();
           ref.meth1();
           ref.meth2();
           ref.meth3();//default keyword for spacial inside
                      // method with body in Abstract Class
           ref.meth4();
           ref.meth5(); 
          Test1 ref1=new My();
           ref1.meth1();
           ref1.meth2();
           ref1.meth3();
           //ref1.meth4(); it is not applicable ,
           //ref1.meth5(); the reference is from Test1 Interface
          Test2 ref2=new My();
           ref2.meth1();
           ref2.meth2();
           ref2.meth3();
           ref2.meth4();
          Test3 ref3=new My();
           ref3.meth5();

      }
          }
