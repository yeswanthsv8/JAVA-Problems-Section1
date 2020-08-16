import java.util.*;
class OddREve
{
  public static void main(String args[])
  { 
     int input1;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter The Input :");
     input1=sc.nextInt();
     if((input1)%2==0)
       {
	 System.out.println("The Input is Even.");
       }

    else
      {
        System.out.println("The Input is Odd.");
      }


  }
}





/*
Explanation;

Get input input1 from user using scanner class

check whether the remainder of input1 divided by 2 is equal to 0 using if statement.

if it is 0, then print input1 is even using system.out.println. Else print input1 is odd using system.out.println.
*/
