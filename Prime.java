import java.util.*;

interface Find
{
public void check(int no);
public void display();
}

public class Sub implements Find
{
int i,no,in=0;
public void check(int no)
{

for(i=1;i<=no;i++)
{
   if(no%i==0)
  {
  in++;
  }

}

if(in==2)
{
System.out.println("It Is A Prime Number.");
}

else
{
System.out.println("Not A Prime Number.");
}

}

}

class Prime
{
public static void main(String args[])
{
int no;
Scanner sc=new Scanner(System.in);
Sub su=new Sub();
System.out.println("Enter The Number:");
no=sc.nextInt();
su.check(no);
}
}