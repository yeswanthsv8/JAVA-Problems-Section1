import java.util.*;
class Natural
{
   public static void main(String args[])
   {
	int lim,i;
	System.out.println("Enter The Limit:");
	Scanner sc=new Scanner(System.in);
     lim=sc.nextInt();
	System.out.println(" The First Natural Numbers are:\n");
	for(i=1;i<=lim;i++)
	 {
		System.out.println(""+i);
      }
    }
}



/*
Explanation:

Instruction(s) inside the for block{} are executed repeatedly till  the second expression (i<=lim) is true.

Here i is initialized to 1 and incremented by 1 for each iteration, instructions inside the for block are executed unless i becomes greater than lim. so value of i will be printed like 1 2 3 .... n using system.out.println.
*/
