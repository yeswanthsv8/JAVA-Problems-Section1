import java.util.*;
class SearchArr
{
  public static void main(String args[])
  {
     int size,i,num;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Size Of Array:");
     size=sc.nextInt();
     int a[]=new int[100];
     System.out.println("Enter The Array Elements:\n");
     for(i=0;i<size;i++)
        {
            a[i]=sc.nextInt();

	}
     System.out.println("Enter The Number You Want To Search:");
     num=sc.nextInt();  
     for(i=0;i<size;i++)
        {
            if(num==a[i])
            {
	          System.out.println("The Position Is:"+i);
	 	  break;
            }
       
           else
             {
                  System.out.println("-1");
		  break;
             }

       }

  }
}







/*
Explanation:

i is initialized to 0 and incremented by 1 at each iteration of both the for loops.

First for loop reads n input numbers from user and stores them in array a[] from location 0 to n-1

using Second for loop the element is searched in each location from 0 to  the location of element or location n-1.

if element is found in a location that location i is stored as pos and exit from the for loop using break statement. 

if element is not found from 0 to n-1 location, pos remains -1.
*/
