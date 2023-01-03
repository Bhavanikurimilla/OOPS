import java.util.*;
class SmallestLargest 
{
int i,n;
int a[]=new int[10];
void read()
{
Scanner sc=new Scanner(System.in);
   System.out.println("enter numbers");
   for(i=0;i<5;i++)
   {
   a[i]=sc.nextInt();
    }
}
void sort()
{
int i,j,temp;
for(i=0;i<5-1;i++)
{
for(j=0;j<5-i-1;j++)
{
if(a[j]>a[j+1])
{
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp; 
}

}
}
System.out.println("smallest is : " + a[0]);
System.out.println("largest is : " +a[5-1]);
}
}
class Main
{
public static void main(String args[])
{
SmallestLargest sl=new SmallestLargest();
sl.read();
sl.sort();
}
}