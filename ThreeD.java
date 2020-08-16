import java.util.*;
class ThreeD
{ 
   public static void main(String args[])
   {

	int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Number:");
	num=sc.nextInt();
	if(num>99 && num<1000)
	{
		System.out.println("It is a Three Digit Number.");
	}
	else
	{
		System.out.println("It is Not a Three Digit Number.");
	}

   }
}



/*
Explanation:

Get input num from user using scanf statement

check whether the num is greater than 99 and less than 100 using if statement.

if it is true, then print num is three digit number using printf statement. Else print num is not three digit number using system.out.println.
*/

