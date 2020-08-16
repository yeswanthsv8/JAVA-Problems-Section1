import java.util.*;
class MulWo
{
   public static void main(String args[])
   {
	int num1,num2,product=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Two Numbers:");
	num1=sc.nextInt();
	num2=sc.nextInt();
	while(num2>0)
	{
		product=product+num1;
		num2--;
	}
	System.out.println("The Product Is:"+product);
	
  }
}


/*
Explanation:

4*5 = 4+4+4+4+4

Add the 4 with product for 5 times using while statement.

*/
