import java.util.*;
class SmallerTw
{
  public static void main(String args[])
  {
     int num1,num2;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter The Two Numbers:");
     num1=sc.nextInt();
     num2=sc.nextInt();
        if(num1<num2)
           {
              System.out.println("The Smallest Number Is:"+num1);              
           }

        else if(num2<num1)
           {
              System.out.println("The Smallest Number Is:"+num2);              
           }

      

 }

}





/*
Explanation: 

Get two inputs num1 and num2 from user using scanner class.

check whether num1 is smaller than num2 using if statement.

if num1 is smaller print num1 using printf statment, else check whether num2 is smaller than num1 using elseif statement.

If num2 is smaller print num2 using system.out.println, else print num1 and num2 are equal using system.out.println.

*/

