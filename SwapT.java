import java.util.*;
class SwapT
{
  public static void main(String args[])
  {
     int input1,input2,temp;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter The Input 1:");
     input1=sc.nextInt();
     System.out.println("Enter The Input 2:");
     input2=sc.nextInt();
     temp=input1;
     input1=input2;
     input2=temp;
     System.out.println("Now The Inputs After Swapping is:");
     System.out.println("The Output is:");
     System.out.println("The Input 1 is:"+input1);
     System.out.println("The Input 2 is:"+input2);
 }

}




/*
Explanation:

Get input1 and input2 using scanner class.

swap the values using third variable temp.

Print input1 and input2 using system.out.println
*/
