import java.util.*;
class Triangle
{
 
       public static void main(String args[])
       {
 
             double base,height;
             double area;
             Scanner sc=new Scanner(System.in);
             System.out.println("Get base and height of Triangle and find area of Triangle");
             System.out.println("Enter The Input 1:");
             base=sc.nextInt();
             System.out.println("Enter The Input 2:");
             height=sc.nextInt();
             area=0.5*base*height;
             System.out.println("The Output 1 Is:\n"+area);

        }

}




/*
Explanation:

Get height and base of a  triangle (using scanner class)

Calculate area by multiplying product of height and base by 0.5  (area = base * height*0.5)

print area (using system.out.println)

*/


