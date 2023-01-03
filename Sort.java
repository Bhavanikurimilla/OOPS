import java.util.*;
class Sort 
{
int i,n;
int a[]=new int[10];
void read()
{

 System.out.println("enter size");
 Scanner sc=new Scanner(System.in);
  n=sc.nextInt();
   System.out.println("enter numbers");
   for(i=0;i<n;i++)
   {
   a[i]=sc.nextInt();
    }
}
void sort()
{
int i,j,temp;
for(i=0;i<n-1;i++)
{
for(j=0;j<n-i-1;j++)
{
if(a[j]>a[j+1])
{
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp; 
}

}
}
System.out.println("sorted elements are:");
for(i=0;i<n;i++)
{
System.out.print(a[i] +"\t");
}
}
}
class Main
{
public static void main(String args[])
{
Sort s=new Sort();
s.read();
s.sort();
}
}