import java.util.*;

class Shapes
{

void option()
{
System.out.println("1. Circle");
System.out.println("2. Square");
System.out.println("3. Sphere");
}

}

class Circle
{
double area,circum;
Circle(String dim)
{
System.out.println(+dim);
}

void getdata(int r)
{
this.r=r;
}

void setdata()
{
circum=2*3.14*r;
area=3.14*r*r;
}

void display()
{
System.out.println("The Radius is:"+r);
System.out.println("The Circumference is:"+circum);
System.out.println("The Area is:"+area);
}

}

class Square
{
double area,dia;
Square(String dim)
{
System.out.println(+dim);
}

void getdata(int a, int d)
{
this.a=a;
this.d=d;
}

void setdata()
{
area=a*a;
dia=1.414*d;
}

void display()
{
System.out.println("The Diagonal is:"+d);
System.out.println("The Area Of The Square is:+area);
System.out.println("The Square Diagonal is:"+dia);
}

}

class Sphere
{
double vol,area;
Sphere(String dim)
{
System.out.println(+dim);
}

void getdata(int ra)
{
this.ra=ra;
}

void setdata()
{
vol=1.34*3.14*ra*ra*ra;
area=4*3.14*ra*ra;
}

void display()
{
System.out.println("The Radius is:"+ra);
System.out.println("The Voulme Of The Sphere is:"+vol);
System.out.println("The Area Of The Sphere is:"+area);
}

}

Class Three
{
public static void main(String args[])
{
int choice;
Scanner sc=new Scanner(System.in);
Shapes s=new Shapes();
System.out.println("Circle Dimension:");
Circle c=new Circle();
c.Circle("1D");
System.out.println("Square Dimension:");
Square sq=new Square("1D");
System.out.println("Sphere Dimension:");
Sphere sp=new Sphere("2D");
s.option();
choice=sc.nextInt();
switch(choice);

{
case 1:
int r;
System.out.println("Enter The Radius Of The Circle:");
r=sc.nextInt();
c.getdata(r);
c.setdata();
c.display();
break;

case 2:
int a,d;
System.out.println("Enter The Side Of The Square:");
a=sc.nextInt();
System.out.println("Enter The Diagonal Of The Square:");
d=sc.nextInt();
sq.getdata(a,d);
sq.setdata();
sq.display();
break;

case 3:
System.out.println("Enter The Radius Of The Sphere:");
ra=sc.nextInt();
sp.getdata(int ra);
sp.setdata();
sp.display();
break;
}




}
}