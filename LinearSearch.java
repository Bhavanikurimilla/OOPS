import java.util.*;
class LinearSearch
{
   int n,i,k;
  int a[]=new int[10];
 Scanner sc=new Scanner(System.in);
void read()
{
  System.out.println("enter size");
 
   n=sc.nextInt();
  System.out.println("enter elements");
  for(i=0;i<n;i++)
{
  a[i]=sc.nextInt();
 }
 }
void search()
{
  System.out.println("enter to search");
   k=sc.nextInt();
  for(i=0;i<n;i++)
   {
     if(a[i]==k)
     {
     System.out.println(k + "found at" + i);
break;
    }
}
if(i==n)
  {
  System.out.println("not found");
  
}}
}
class Main
{
public static void main(String args[])
{
   LinearSearch ls=new  LinearSearch();
   ls.read();
   ls.search();
}
 
}
