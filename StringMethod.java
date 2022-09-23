import java.util.*;
 class StringMethod{
      public static void main(String[] args){
              String first = "java programming";
              String second = "java programming";
              String third ="javascript programming";


            // get the length of greet
            int length = first.length();
            System.out.println("Length: " + length);
 
           // join two strings
           String joinedString = first.concat(third);
           System.out.println("Joined String: " + joinedString);

           // Java Strings are Immutable
           first = first.concat(" Python");
           System.out.println(first);

/*It looks like we are able to change the value of the previous string. However, this is not true.
Let's see what has happened here,
JVM takes the first string "java programming "
creates a new string by adding "python" to the first string
assign the new string "java programming python" to the example variable
the first string "java programming" remains unchanged*/


           // compare first and second strings
           boolean result1 = first.equals(second);
           System.out.println("Strings first and second are equal: " + result1);

           // compare first and third strings
          boolean result2 = first.equals(third);
          System.out.println("Strings first and third are equal: " + result2);

           // use the escape character
           String example = "This is the \"String\" class.";

          //create a string using the new keyword
          String name = new String("Java String");
          //Here, when we create a string object, the String() constructor is invoked. 

/*
           Methods of Java String
          
contains()	   checks whether the string contains a substring
substring()	   returns the substring of the string
join()	        join the given strings using the delimiter
replace()	        replaces the specified old character with the specified new character
replaceAll()	   replaces all substrings matching the regex pattern
replaceFirst()	   replace the first matching substring
charAt()	        returns the character present in the specified location
getBytes()	   converts the string to an array of bytes
indexOf()	        returns the position of the specified character in the string
compareTo()	   compares two strings in the dictionary order
compareToIgnoreCase()	compares two strings ignoring case differences
trim()	        removes any leading and trailing whitespaces
format()	        returns a formatted string
split()	        breaks the string into an array of strings
toLowerCase()	   converts the string to lowercase
toUpperCase()	   converts the string to uppercase
valueOf()	        returns the string representation of the specified argument
toCharArray()	   converts the string to a char array
matches()	        checks whether the string matches the given regex
startsWith()	   checks if the string begins with the given string
endsWith()	   checks if the string ends with the given string
isEmpty()	        checks whether a string is empty of not
intern() 	        returns the canonical representation of the string
contentEquals()   checks whether the string is equal to charSequence
hashCode()	   returns a hash code for the string
subSequence()	   returns a subsequence from the string
*/

         }
 }