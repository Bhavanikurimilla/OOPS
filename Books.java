import java.util.*;
import java.lang.*;
class Book
{
 String bname,bauthor;
 int bq;
 public static void main(String args[])
{
  int n,i,k,j,qq,s,bt,cid;
  String Book,cname,cadd;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter books available:");
  n=sc.nextInt();
  Book bk[]=new Book[n]; 
  for(i=0;i<n;i++)
{
 bk[i]=new Book();
System.out.println("enter book name:");
bk[i].bname=sc.next();
System.out.println("enter no.of books:");
bk[i].bq=sc.nextInt();
System.out.println("enter book author:");
bk[i].bauthor=sc.next();
}
System.out.println("enter  no.of customers:");
s=sc.nextInt();
for(i=0;i<s;i++)
{
  System.out.println("enter customer id:");
  cid=sc.nextInt();
 System.out.println("enter customer name:");
  cname=sc.next();
 System.out.println("enter customer address:");
  cadd=sc.next();
 System.out.println("enter how many books do you want?");
 bt=sc.nextInt();
  for(j=0;j<bt;j++)
  {
  System.out.println("enter Book name and quantity:");
  Book=sc.next();
  qq=sc.nextInt();
  for(k=0;k<n;k++)
{
  if(Book.equals(bk[k].bname))
{
 if(qq>bk[k].bq)
{
 System.out.println(cname+"bought"+""+Book+""+qq+""+"books available"+""+Book+""+"books are 0");
 break;
}
if(qq<=bk[k].bq)
{
  bk[k].bq=bk[k].bq-qq;
} 
 System.out.println(cname+"bought"+""+Book+""+qq+"books available"+""+Book+"books are"+""+bk[k].bq);
break;
  }
}
}
}
}
}
}