//To Reverse The Second Half Of Array Elements...

import java.util.*;

class Revse
{
  public static void main(String args[])
   {
     int size,i,j;
     Scanner sc=new Scanner(System.in);

     System.out.println("Enter The Size Of The Array:");
     size=sc.nextInt();

     int a[]=new int[size];

    System.out.println("Enter The Array Elements:");

    for(i=0;i<size;i++)
     {
         a[i]=sc.nextInt();
     }


    for(i=(size/2),j=size-1;i<j;i++,j--)
      {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
      }

   System.out.println("The Output Is:");
   for(i=0;i<size;i++)
     {
        System.out.println(" "+a[i]);
     }

   }
}
