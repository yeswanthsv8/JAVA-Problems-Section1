import java.uti.*;
import java.lang.Math;

class  Finvest
{
public static void main(String args[])
{
int years,interest,pa,fu;
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Present Investment:");
pa=sc.nextInt();

System.out.println("Enter No.Of Years:");
years=sc.nextInt();

System.out.println("Enter Interest Amount:");
interest=sc.nextInt();

fu=pa*Math.pow((i+1),years);

System.out.println("The Future Investment Value Is:"+fu);
}
}