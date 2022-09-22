import java.util.*;
import java.util.stream.IntStream;

public class Array{
    public static void main(String[] args){

        int[] arr0; // declare an array
        int arr1[]; // declare an array
    
        /*Note that we've only created an array reference. 
        No memory has been allocated to the array as the size is unknown,
         and we can't do much with it.*/


        int[] arr2 = {1,2,3,4};// The most common and convenient strategy declare and initialized
        String[] arr3 = {"Volvo", "BMW", "Ford", "Mazda"}; // String Array


        int[] arr4 = new int[10]; //declared an integer array object containing 10 elements, 
        arr4[4] = 500;            //so you can initialize each element using its index value.
       

        int[] arr5 = new int[]{13, 14, 15};//initialize the array using the new keyword as well
        String[] arr6 = new String[]{"zelda", "link", "ganon"};//It works the same way.
        

        int[] arr7 = IntStream.range(1, 11).toArray();//code creates an array of ten integers, containing the numbers 1 to 10:
        // all Instream function   1)IntStream.rangeClosed()
                                // 2)IntStream.of()
                                // 3)IntStream.rangeClosed()

        for(int i=0; i<arr2.length; i++){
        System.out.println(arr2[i]);
        }

        for(int i=0; i<arr3.length; i++){
        System.out.println(arr3[i]);
        }

         for(int i=0; i<arr4.length; i++){
        System.out.println(arr4[i]);
        }

        
         for(int i=0; i<arr5.length; i++){
        System.out.println(arr5[i]);
        }

        
         for(int i=0; i<arr6.length; i++){
        System.out.println(arr6[i]);
        }


        for(int i=0; i<arr7.length; i++){
        System.out.println(arr7[i]);
        }

    


        



    }

public static String[] getNames() {
    return new String[]{"java", "python", "javascript"}; // Works
}

/*
public String[] getNames() {
    return {"zelda", "link", "ganon"}; // Doesn't work
}    
*/    

}