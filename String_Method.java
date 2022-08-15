import java.util.*;

public class String_Method{
          public static void main(String[] args){
                   
                   //Formatted Output
                  int x=10;
                  float y=12.56f;
                  char z='A';
                  String str="  Java Program";
                      
                    System.out.printf("%3$s %2$f %1$d\n\n",x,y,str);
                    System.out.printf("Hello %d %f %c %s\n",x,y,z,str);
                    System.out.printf("%90s\n\n",str);
                     


                     
                   String str1=new String("JAVA");
                   System.out.println(str1);
               
                   char arr[]={'H','e','l','l','o'};
               //String str3=new String(c);
                   String str2=new String(arr,1,3);
                   System.out.println(str2);
               
                   byte arr1[]={65,66,67,68};
               //String str4=new String(b);
                   String str3=new String(arr1,1,2);
                   System.out.println(str3);


                   String str4=new String("netbeans");
                   String str5=str4.toUpperCase();
                   System.out.println(str5);
        
        
                   str=str.trim();
                   System.out.println(str);
        
                   String str6=str.substring(3,8);
                   System.out.println(str6);
        
                   String str7=str.replace('J', 'M');
                   System.out.println(str7);
        
                   
                   String str8="Mr. Prakash Khatua";
                   System.out.println(str8.startsWith("Mr."));
                   System.out.println(str8.startsWith("P" , 4));
                   System.out.println(str8.startsWith("K" , 4));
                   System.out.println(str8.endsWith("Khatua"));
                   System.out.println(str8.charAt(4));
                   System.out.println(str8.indexOf("."));
                   System.out.println(str8.indexOf(".",4));
                   System.out.println(str8.indexOf("Khatua"));
                   System.out.println(str8.lastIndexOf("."));




                   String str9="Prakash";
                   String str10="prakash";
        
                   System.out.println(str9.equals(str10));
                   System.out.println(str9.equalsIgnoreCase(str10));
       
        
                   String str11="the great wall ";
                   String str12="of china";
                   System.out.println(str11.contains("wall"));
                   System.out.println(str11.concat(str12));
                   System.out.println(str11 + str12);
                   
                   
               }
          }