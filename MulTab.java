import java.util.*;
class MulTab
 {
     public static void main(String args[])
     {
          int i,table,numberoftimes;
          System.out.println("Enter The Number Of Times And Table value");
          Scanner sc=new Scanner(System.in);
          table=sc.nextInt();
          numberoftimes=sc.nextInt();
          for(i=1;i<=table;i++)
            {
                 System.out.println(""+i*numberoftimes);
            }
      }
}




/*
Explanation:

Instruction(s) inside the for block{} are executed repeatedly till  the second expression (i<=table)is true.

Here i is initialized to 1 and incremented by 1 for each iteration, instructions inside the for block are executed unless i becomes greater than m. so value of i (1,2,3,...m)will be multiplied with n and printed in table format.



*/
