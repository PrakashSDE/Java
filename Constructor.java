import java.util.*;

class Parent
{
    public Parent(){
        System.out.println("Parent Constrcutor");
    }

     public Parent(int a){
        System.out.println("Parent Constrcutor 1");
    }

     public Parent(int c,int d){
        System.out.println("Parent Constrcutor 2");
    }
            
}

class Child extends Parent
{
    public Child(){
        System.out.println("Child Constructor");
    }

     public Child(int m){
        super(m);
        System.out.println("Child Constructor1");
    }

     public Child(int n,int k){
        super(n,k);
        System.out.println("Child Constructor2");
    }
}


public class Constructor
{
    public static void main(String[] args) {
        Child ref = new Child();
        Child ref1 = new Child(10);
        Child ref2 = new Child(10,20);
    }  
}
