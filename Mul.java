import java.util.*;

class Mul
{
     public static void main(String args[])
     {
          int num1,num2,sum=0;
         Scanner sc=new Scanner(System.in)

         System.out.println("Enter The Number1:");
         num1=sc.nextInt();

        System.out.println("Enter The Number2:");
        num2=sc.nextInt();

       while(num2>0)
         {
               sum=sum+num1;
              num2--;
         }
      System.out.println("The Output Is:"+sum);

   }
}