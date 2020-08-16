import java.util.*;
class SAvArray
{
  public static void main(String args[])
  {
     int size,i,sum=0;
     double avg;     
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Size Of Array:");
     size=sc.nextInt();
     int a[]=new int[100];
     System.out.println("Enter The Array Elements:\n");
     for(i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
	    sum=sum+a[i];
	}
     System.out.println("The Sum Of Array Elements Is:\n"+sum);
     avg=sum/size;
     System.out.println("The Average Is:"+avg);
     

  }
}


/*
Explanation:

i is initialized to 0 and incremented by 1 at each iteration of both the for loops.

First for loop reads n input numbers from user and stores them in array a[] from location 0 to n-1

Second for loop adds all the n elements of array located from 0 to n-1

Finally compute average using avg=sum/n statement and prints average avg using system.out.println.


*/
