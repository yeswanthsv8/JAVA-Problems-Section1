import java.util.*;
class SumOfNInputs
  {
     public static void main(String args[])
     {
          int i,n,num,sum=0;
          System.out.println("Enter Number Of Numbers You Want To Sum");
          Scanner sc=new Scanner(System.in);
          n=sc.nextInt();
          System.out.println("Enter The Numbers To Sum");
         for(i=1;i<=n;i++)
           {
                num=sc.nextInt();
                sum=sum+num;
           }
         System.out.println("The Sum Is: "+sum);
     }
}



/*
Explanation:

Instruction(s) inside the for block{} are executed repeatedly till  the second expression (i<=n) is true.

Here i is initialized to 1 and incremented by 1 for each iteration, instructions inside the for block are executed unless i becomes greater than n. so value of num given by user will be added to sum at each iteration.

after adding all n numbers given by user to sum, sum will be printed using system.out.println.
*/
