import java.util.*;

interface perimeter
{
public void getdata(int r);
public void getdata(int l,int b);
public void setdata();
}

class Circle
{
double area;
void getdata(int r)
{
this.r=r;
}

void setdata()
{
area=2*3.14*r;
System.out.println("The Area Of The Circle is:"+area);
}

}

class Rectangle
{
double area;
void getdata(int l,int b)
{
this.l=l;
this.b=b;
}

void setdata()
{
area=2*(l+b);
System.out.println("The Area Of The Rectangle is:"+area);
}

}

class Peri
{
public static void main(String args[])
{
int l,b,r;
Scanner sc=new Scanner(System.in);
r=sc.nextInt();
l=sc.nextInt();
b=sc.nextInt();
Circle c=new Circle();
Rectangle r=new Rectangle();
c.getdata(r);
c.setdata();
r.getdata(l,b);
r.setdata();
}
}


















































































































































































































































































































































l=sc.nextInt();
b=sc.nextInt();
r=sc.nextInt();
}
}











