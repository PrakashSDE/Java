import java.util.*;
  

  //Base Class/Parent Class/ Super Class
class Circle{
    public float radius;
    public double area(){
        return Math.PI * radius *radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
}


//Derive Class/Child Class/ Sub Class 
class Cylinder extends Circle{
    public double height;
    public double volumn(){
        return area()*height;
    }
}



//Parameterised Constructor in Inheritance
  class Parent
{
    Parent(){
        System.out.println("Without Parameter in Parent");
    }

    Parent(int x){
        System.out.println("Only one parameter in Parent  " +x);
    }

    Parent(int y,int z){
        System.out.println("Two Parameter in Child  "+y+ "  " +z);
    }
}


class Child extends Parent
{
    Child(){
        System.out.println("Without Parameter in Child");
    }
    Child(int m){
        super(m);
        System.out.println("Only One Parameter in Child");
    }
    Child(int n,int k){
       super(n,k);
        System.out.println("Two Parameter in Child  "+n+ "  " +k);
    }
}


public class Inheritance {
      public static void main(String[] args){
            Circle c1=new Circle();
            Cylinder c2=new Cylinder();
            c2.radius=10;
            c2.height=20;
            System.out.printf("\n\n");
            System.out.println("perimeter " +c2.perimeter());
            System.out.println("area " +c2.area());
            System.out.println("volumn " +c2.volumn());
            System.out.printf("\n\n");




            Child c3=new Child();
              System.out.printf("\n\n");
            Child c4=new Child(20);
              System.out.printf("\n\n");
            Child c5=new Child(10,20);
              System.out.printf("\n\n");
          }
          }