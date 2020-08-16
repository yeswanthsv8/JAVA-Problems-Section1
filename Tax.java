import java.util.*;

interface Customer
{
public void information();
public void show();
}


public class Employees implements Customer
{
int inc,tax;
public void information(int inc)
{
this.inc=inc;
}


public void show()
{
if(inc>=190000)
{
System.out.println("Tax Percentage:");
tax=0*inc;
System.out.println("For Male:"+tax);
tax=0*inc;
System.out.println("For Female:"+tax);
}

else if(inc>=200000)
{
System.out.println("Tax Percentage:");
tax=0.1*inc;
System.out.println("For Male:"+tax);
tax=0*inc;
System.out.println("For Female:"+tax);
}

else if(inc>=1900000)
{
System.out.println("Tax Percentage:");
tax=0.2*inc;
System.out.println("For Male:"+tax);
tax=0.1*inc;
System.out.println("For Female:"+tax);
}

else
{
System.out.println("Tax Percentage:");
tax=0.25*inc;
System.out.println("For Male:"+tax);
tax=0.2*inc;
System.out.println("For Female:"+tax);
}

}
}

}

class Tax
{
public static void main(String args[])
{
int inc;
Scanner sc=new Scanner(System.in);
Employees e=new Employees();
System.out.println("Enter The Income:");
inc=sc.nextInt();
e.information(inc);
e.show();
}
}

