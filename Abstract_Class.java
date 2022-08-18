import java.util.*;

abstract class parent{

    public void display(){
        System.out.println("Parent Class Display");
    }

     //Abstract Method
    abstract public void Display_Abstract();

}


    class child extends parent{
     //Method Overrideing 
    public void Display_Abstract(){
        System.out.println("Child Class Display");
     }
     
}

public class Abstract_Class {
      public static void main(String[] args){
            parent ref1 = new child();
           /* parent ref2 = new parent(); it is not applicable in 
           abstract class because in abstract class no object will be created.
           and to convert new child class into a non abstract class/concrete class
           must we have to do override all the abstract method in abstract parent class*/ 
            child ref3 = new child();

            ref1.Display_Abstract();
            ref3.Display_Abstract();
     
          }
          }