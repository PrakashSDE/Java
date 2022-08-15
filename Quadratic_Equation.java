import java.util.*;

public class Quadratic_Equation{
          public static void main(String[] args){
          Scanner sc= new Scanner(System.in);
          long a=sc.nextLong();
          long b=sc.nextLong();
          long c=sc.nextLong();

          double r1=(-b+Math.sqrt(b*b-4*a*c))/2*a;
          double r2=(-b-Math.sqrt(b*b-4*a*c))/2*a;
          System.out.println("The root of equation is: " +r1+  "  "  +r2);
          }
}