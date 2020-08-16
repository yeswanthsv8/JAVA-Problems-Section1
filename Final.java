import java.util.*;

abstract class Abs
{
abstract void addition();
abstract void subtraction();
}

class Two extends Abs
{
int sum=0,sub,a,b;
void addition(int a,int b)
{
sum=a+b;
System.out.println("The Sum Is:"+sum);
}

void subtraction(int a,int b)
{
sub=a-b;
System.out.println("The Subtraction Is:"+sub);
}

}

final class One
{
int mul,a,b;
void multiplication(int a,int b)
{
mul=a*b;
System.out.println("The Product Is:"+mul);
}

}








class Final
{
public static void main(String args[])
{
int a,b;
Scanner sc=new Scanner(System.in);
two t=new Two();
One o=new One();
System.out.println("Enter The Value Of A:")
a=sc.nextInt();
System.out.println("Enter The Value Of B:")
b=sc.nextInt();
t.addition(int a,int b);
t.subtraction(int a,int b);
o.multiplication(int a,int b);
}
}	