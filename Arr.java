package My_package;
interface Sort
{
public void getno(int limno);
public void getstr(int limstr );
}


public class Arr
{
int  notemp,limno,limstr;
int i,j,k;
int a[]=new int[limno];
int b[]=new int[limstr];
String strtemp;

public void getno(int limno)
{
this.limno=limno;

System.out.println("Enter The List Of Number:");
for(i=0;i<limno;i++)
{
a[i]=sc.nextInt();
}

for(i=0;i<limno;i++)
{
	for(j=i+1;j<limno;j++)
                   {
	notemp=a[i];
	a[i]=a[j];
	a[j]=notemp;
                   }
}

for(k=0;k<limno;k++)
{
System.out.println("The Sorted Number Is:"+k[i]);
}

}

public void getstr(int limstr)
{
this.limstr=limstr;

System.out.println("Enter The Strings:");
for(i=0;i<limstr;i++)
{
b[i]=sc.next();
}


for(i=0;i<limstr;i++)
{
	for(j=i+1;j<limstr;j++)
                   {
		if(a[i].compareTo(a[j]))
		{
	                      strtemp=a[i];
	                      a[i]=a[j];
	                      a[j]=strtemp;
                      	}
                  }
}

for(k=0;k<limstr;k++)
{
System.out.println("The Sorted String Is:"+k[i]);
}

}

}