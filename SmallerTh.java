import java.util.*;
class SmallerTh
{
        public static void main(String args[])
        {
              int num1,num2,num3;
              Scanner sc=new Scanner(System.in);
	         System.out.println("Enter three numbers:");
              num1=sc.nextInt();
              num2=sc.nextInt();
              num3=sc.nextInt();
	
	             if(num1 < num2 && num1 < num3)
	                {
		              System.out.println("The Smallest Is"+num1);
	                }
	             else if(num2 < num3)
	                {
		               System.out.println("The Smallest Is"+num2);
	                }
	             else
	                {
		               System.out.println("The Smallest Is"+num3);
	                }	
         }
}









/*
Explanation: 

Get three inputs num1,num2 and num3 from user using scanner class.

check whether num1 is smaller than num2 and num1 is smaller than num3 using if statement.

if num1 is smaller print num1 using printf statment, else check whether num1 is smaller than num3 using elseif statement.

If num2 is smaller print num2 using system.out.println, else print num3 using system.out.println.

*/

