import java.util.*;
class Subtraction
{
      public static void main(String args[])
      {
 
            int Input1,Input2,sub;
            Scanner sc=new Scanner(System.in);

            System.out.println("Enter The Input 1:");
            Input1=sc.nextInt();
            System.out.println("Enter The Input 2:");
            Input2=sc.nextInt();
            sub=Input1-Input2;
            System.out.println("The Output Is:\n"+sub);
       }

}



/*
Explanation:

Get two integers Input1 and Input2  (using scanner class)

Subract Input2 from Input1, then store the difference in sub (sub= Input1-Input2)

print the value of sub (using system.out.println)

*/
