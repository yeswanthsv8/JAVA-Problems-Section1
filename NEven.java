import java.util.*;
class NEven
 {
    public static void main(String args[])
    {
          int i,j,lim;
          System.out.println("Enter The Value Of N");
          Scanner sc=new Scanner(System.in);
          lim=sc.nextInt();
          System.out.println("The N Even Numbers: ");
          for(j=1,i=0;j<=lim;i=i+2,j++)
              {
                   System.out.println(""+i);
              }
    }
} 




/*
Explanation:

Instruction(s) inside the for block{} are executed repeatedly till  the second expression (j<=lim) is true.

Here i and j are initialized to 1 and i is incremented by 1 and j is incremented by 1. for each iteration, instructions inside the for block are executed unless j becomes greater than n. so value of i (2,4,6,8,.....) (n odd numbers) in each iteration will be printed using system.out.println. 
*/
