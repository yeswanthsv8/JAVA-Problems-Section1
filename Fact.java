import java.util.*;

interface Concept
{
public void check(int no);
}

public class Fsub
{
int fact=1,i;
public void check(int no)
{
for(i=1;i<no;i++)
{
fact=fact*i;
}
System.out.println("The Factorial Is:"+fact);
}

}

class Fact
{
public static void main(String args[])
{
int no;
Scanner sc=new Scanner(System.in);
Fsub f=new Fsub();
System.out.println("Enter The Number:");
no=sc.nextInt();
f.check(no);
} 
}