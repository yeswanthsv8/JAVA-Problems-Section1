import java.util.*;

class Triangle
{
public static void main(String args[])
{
int s1,s2,s3;
Scanner sc=new Scanner(System.in);
System.out.println("Enter The First Side:");
s1=sc.nextInt();
System.out.println("Enter The Second Side:");
s2=sc.nextInt();
System.out.println("Enter The Third Side:");
s3=sc.nextInt();
if((s1==s2) && (s1==s3) && (s2==s3))
{
System.out.println("It Forms Triangle.");
}

else
{
System.out.println("It Does Not Forms Triangle.");
}

}
}