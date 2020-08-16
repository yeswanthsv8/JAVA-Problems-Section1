import java.util.*;

class Books
{

void BookName(ArrayList<String> a)
{
a.add("Wimpy Kid");
a.add(" Novel");
}

void AuthorName(ArrayList<String> a)
{
a.add(3,"jeff Kiney");
a.add(4,"Chetan Bhagat");
}

void PublisherName(ArrayList<String> a)
{
a.remove("Novel");
}

void search(ArrayList<String> a)
{
for(i=0;i<a.size();i++)

{
System.out.println("Enter The First Letter To Check:")
if(a.get(i).startsWith("C"))

{
System.out.println("This Book Is Available:"+a.get(i));
break;
}

else
{
System.out.println("This Book Is Not Available.");
}

}

}
}


class Oper
{
public static void main(String args[])
{
String str;
int i;
Scanner sc=new Scanner(System.in);
Books b=new Books();
ArrayList<String> a=new ArrayList<String>();
System.out.println("Enter The Word:");
str=sc.next();
for(i=o;i<5;i++)

{
a.add(str);
}
System.out.println("After Adding:");
b.BookName(a);
System.out.println(a);

System.out.println("After Inserting:");
b.AuthorName(a);
System.out.println(a);

System.out.println("After Delelting:");
b.PublisherName(a);
System.out.println(a);

System.out.println("Searching:");
b.search(a);
System.out.println(a);

}
}