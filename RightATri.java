import java.util.*;
class RightATri
{
 
       public static void main(String args[])
       {
 
           int length,breadth,area;
           Scanner sc=new Scanner(System.in);
           System.out.println("Get the length and breadth of Right Angled Triangle and find area of it.");
           System.out.println("Enter The Input 1:");
           length=sc.nextInt();
           System.out.println("Enter The Input 2:");
           breadth=sc.nextInt();
           area=(length*breadth)/2;
           System.out.println("The Output 1 Is:\n"+area);

       }

}



/*
Explanation:

Get length and breadth of a right angled triangle (using scanner class)

Calculate area by dividing product of length and breadth by 2  (area = length * breadth/2)

print area (using system.out.println)
*/


