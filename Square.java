import java.util.*;
class Rectangle
{
 
       public static void main(String args[])
       {
 
            int side,area;
            Scanner sc=new Scanner(System.in);
            System.out.println("Get side of square and find area of square");
            System.out.println("Enter The Input 1:");
            side=sc.nextInt();
            area=side*side;
            System.out.println("The Output 1 Is:\n"+area);

        }

}


/* 
Explanation:

Get side of a square (using scanner class)

Calculate area by multiplying side and side(area = side * side)

print area(using System.out.println()) 

*/
