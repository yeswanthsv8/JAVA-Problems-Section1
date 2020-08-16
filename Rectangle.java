import java.util.*;
class Rectangle
{
 
       public static void main(String args[])
       {
 
             int length,breadth,area;
 		   Scanner sc=new Scanner(System.in);
             System.out.println("Get length and breadth of Rectangle and find area of Rectangle");
             System.out.println("Enter The Input 1:");
             length=sc.nextInt();
             System.out.println("Enter Input 2:");
             breadth=sc.nextInt();
             area=length*breadth;
             System.out.println("The Output 1 Is:\n"+area);

       }

}



/*
Explanation:

Get length and breadth of a rectangle (using scanner class)

Calculate area by multiplying length and breadth (area = length * breadth)

print area (using system.out.println)
*/



