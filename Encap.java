import java.util.*;

class Ins
{
public int a,b;
private int add,sub;

void addition(int a,int b)
{
add=a+b;
System.out.println("The Addition Is:"+add);
}

void subtract(int a,int b)
{
sub=a-b;
System.out.println("The Subtraction Is:"+sub);
}

}

class Encap
{
public static void main(String args[])
{
int a,b;
Scanner sc=new Scanner(System.in);
Ins in =new Ins();
System.out.println("Enter The Value Of A:");
a=sc.nextInt();
System.out.println("Enter The Values Of B:")
b=sc.nextInt();
in.addition(a,b);
in.subtract(a,b);
}
}