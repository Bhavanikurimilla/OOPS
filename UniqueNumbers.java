import java.util.*;
class UniqueNumbers
{
  public static void main(String  args[])
{
 int i,j,t=0;
 int s=0,r=0;
 int a[]={0,0,0,0,0};
 System.out.println("enter values btw 10 and 100 ");
 Scanner sc=new Scanner(System.in);
 for(j=0;j<5;j++)
 {
  System.out.println("enter element:");
  t=sc.nextInt();
  if(t>=10 && t<=100)
 {
 for(i=0;i<r;i++)
 {
 if(a[i]==t)
 s++;
 }
 if(s>0)
{
  System.out.println("duplicate found enter other value");
  s--;
  j--;
  continue;
}
else
{
  a[j]=t;
  System.out.println("unique values are:");
  for(i=0;i<=r;i++)
{
      System.out.println(a[i]+"");
}
     r++;
}
}
else
{
System.out.println("outof range");
j--;
}
}
}
}