import java.util.*;
class SumOfN
  {
    public static void main(String args[])
    {
      int i,lim,sum=0;
      System.out.println("Enter The Limit:");
      Scanner sc=new Scanner(System.in);
      lim=sc.nextInt();
        for(i=1;i<=lim;i++)
          {
            sum=sum+i;
          }
        System.out.println("The Sum Is: "+sum);
    }
}



/*
Explanation:

Instruction(s) inside the for block{} are executed repeatedly till  the second expression (ifor block are executed unless i becomes greater than lim. so value of i (1,2,3,...n)will be added to sum.


after adding all n natural numbers to sum, sum will be printed using system.out.println.


*/
