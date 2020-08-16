import java.util.*;
class SumOfNEven
 {
    public static void main(String args[])
    {
       int i,j,N,sum=0;
       System.out.println("Enter The Value Of N");
       Scanner sc=new Scanner(System.in);
       N=sc.nextInt();
       System.out.println("The N Even Numbers: ");
       for(j=1,i=0;j<=N;i=i+2,j++)
       {
            System.out.println(""+i);
            sum=sum+i;
       }
            System.out.println("The Sum Of N Even Numbers: "+sum);
    }
} 



/*
Explanation:

Instruction(s) inside the for block{} are executed repeatedly till  the second expression (j<=N) is true.

Here i is initialized to 2 and incremented by 2 for each iteration, instructions inside the for block are executed unless i becomes greater than n. so value of i (2,4,6,...n)will be added to sum.

after adding all n even numbers to sum, sum will be printed using system.out.println.
*/
