import java.util.*;
class Multiplication
{
      public static void main(String args[])
      {
 
           int Input1,Input2,mul;
           Scanner sc=new Scanner(System.in);

           System.out.println("Enter The Input 1:");
           Input1=sc.nextInt();
           System.out.println("Enter The Input 2:");
           Input2=sc.nextInt();
           mul=Input1*Input2;
           System.out.println("The Output Is:\n"+mul);
      }

}



/*
Explanation:

Get two integers Input1 and Input2 (using scanner class)

multiply Input1 and Input1, then store the product in mul (mul=Input1*Input2)

print the value of mul (using system.out.println)

*/
