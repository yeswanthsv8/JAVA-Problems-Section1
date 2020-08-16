import java.util.*;

class StrLength
{
 public static void main(String args[])
 {
   int len;
   String str;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter The String:");
   str=sc.next();
   len=str.length();
   System.out.println("The Length Of The String Is:"+len);
 }
}



/*
Explanation:

First of all declare the variable str with String.

Then,from the input,find the length of the string by using the keyword (variable_name.length()).

After Obtaining the length,display it.
*/
