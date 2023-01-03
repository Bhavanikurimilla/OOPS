import java.util.*;
class SortNames
{
public static void main(String args[])
{
int n,i,j;
Scanner sc=new Scanner(System.in);
System.out.println("enter size of array");
n=sc.nextInt();
String temp;
String name[]=new String[n];
System.out.println("enter names:");
for(i=0;i<n;i++)
{
name[i]=sc.next();
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
  if(name[i].compareTo(name[j])>0)
{
 temp=name[i];
 name[i]=name[j];
 name[j]=temp;
}
}
}
System.out.println("sorted names:");
for(i=0;i<n;i++)
{
System.out.println(name[i]);
}
}
}