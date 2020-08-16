import java.util.*;

interface Student
{
public void getdata(int marks);
public void display();
}
                
class Cal implements Student
{

void getdata(int marks)
{
this.marks=marks;
}

void display()
{
if(marks>=90)
{
System.out.println("A Grade.");
}

else if(marks>=80 && marks<90)
{
System.out.println("B Grade.");
}

else if(marks>=70 && marks<80)
{
System.out.println("C Grade.");
}

else
{
System.out.println("D Grade.");
}

}

}

class Grade
{
public static void main(String args[])
{
int marks;
Scanner sc=new Scanner(System.in);
marks=sc.nextInt();
Cal ca=new Cal();
ca.getdata(marks);
ca.display();
}
}