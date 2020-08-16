import java.util.*;

class Charges
{
public static void main(String args[])
{
int c_id,units;
double bill=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Connection Id:");
c_id=sc.nextInt();
System.out.println("Enter The No Of Units:");
units=sc.nextInt();
if(units>0 && units<=100)
{
bill=bill+units*1;                                                                    
}

else if(units>101 && units<=200)
{
bill=(100*1)+(units-100)*2.50;
System.out.println("The BillAmount Is:"+bill);
}

else if(units>=201 && units<=500 )
{
bill=(100*1)+(100*2.50)+(units-200)*4;
System.out.println("The BillAmount Is:"+bill);
}

else
{
bill=(100*1)+(100*2.50)+(300*4)+(units-500)*6;
System.out.println("The BillAmount Is:"+bill);
}

}
}