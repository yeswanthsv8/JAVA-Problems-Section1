import java.util.*;
class NaturalInRev
{
   public static void main(String args[])
   {
	int lim,i;
	System.out.println("Enter The Limit:");
	Scanner sc=new Scanner(System.in);
     lim=sc.nextInt();
	System.out.println(" The Natural Numbers Is In Reverse Order:\n");
	for(i=lim;i>=1;i--)
	 {
		System.out.println(""+i);
      }
    }
}



/*
Explanation:

Instruction(s) inside the for block{} are executed repeatedly till  the second expression (i>1) is true.

Here i is initialized to 1 and decremented by 1 for each iteration, instructions inside the for block are executed unless i becomes greater than 1. so value of i will be printed like n...3 2 1 using system.out.println.
*/
