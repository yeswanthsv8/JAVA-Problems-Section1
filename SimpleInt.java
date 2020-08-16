import java.util.*;
class SimpleInt
{
 public static void main(String args[])
 {
   int no,pa;
   double rate,si;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter The Number Of Months:");
   no=sc.nextInt();
   System.out.println("Enter The Rate:");
   rate=sc.nextDouble();
   System.out.println("Enter The Principle Amount:");
   pa=sc.nextInt();
   si=(pa*rate*no)/100;
   System.out.println("The Simple Interest Is:"+si);
 }

}




/*
Explanation:

Get principal pa, number of months no and rate of intereset rate as inputs.(using scanner class)

calculate Simple Intereset Si by formula Si= pa*no*rate/100

print Simple Interest Si using system.out.println.
*/
