import java.util.*;

class Alphabet
{
public static void main(String args[])
{
String Temp;
int n=args.length();
int i,j,k,a[n];
Scanner sc=new Scanner(System.in);
for(i=0;i<n;i++)
{
   for(j=i+1;j<n;j++)
   {
       if(a[i].compareTo(a[j]))
       {
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
        }
  }
}

for(k=0;k<n;k++)
{
System.out.println("Now Sorted Array Is:");
System.out.println(+a[k]);
}

}
}