import java.util.Scanner;//Import the Scanner class

public class Input_From_Keyboard{
          public static void main(String[] args){
          Scanner sc =new Scanner(System.in); //Create a Scanner Object
          

          String str=sc.nextLine();
          sc.nextLine();         
          System.out.println("nextLine=" +str);


          byte a;
          short b;
          int c;
          long d;
          a=sc.nextByte();         //Stores whole numbers from -128 to 127(1byte)
          b=sc.nextShort();       //Stores whole numbers from -32,767 to 32,767(2byte)
          c=sc.nextInt();         //Stores whole numbers from -2,147,483,648 to 2,147,483,647(4byte)
          d=sc.nextLong();        //Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807(8 byte)
          System.out.println("nextByte=" +a +"  nextShort=" +b+ "  nextInt=" +c+ "  nextLong=" +d);
          


          float e=sc.nextFloat();       //(4 bytes) Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
          double f=sc.nextDouble();     //(8 bytes) Stores fractional numbers. Sufficient for storing 15 decimal digits
          boolean g=sc.nextBoolean();   // (1 bit) Stores true or false values
          System.out.println("nextFloat=" +e +"  nextDouble=" +f+ "  nextBoolean=" +g);
          
     

          }
}
