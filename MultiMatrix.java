import java.util.*;
class MultiMatrix
{
public static void main(String args[])
{
  int n1,n2,m1,m2,k,i,j;
  int a[][]= new int[10][10];
  int b[][]= new int[10][10];
  int c[][]= new int[10][10];
Scanner sc=new Scanner(System.in);
  System.out.println("enter rows and column for 1st matrix");
  m1=sc.nextInt();
  n1=sc.nextInt();
  System.out.println("enter rows and column for 2st matrix");
  m2=sc.nextInt();
  n2=sc.nextInt();
  if(n1!=m2)
   {
System.out.println("impossible");
    }
else
{
  System.out.println("enter 1st matrix");
  for(i=0;i<m1;i++)
{
for(j=0;j<n1;j++)
{
  a[i][j]=sc.nextInt();
}
}
  System.out.println("enter 2nd matrix");
  for(i=0;i<m2;i++)
{
for(j=0;j<n2;j++)
{
  b[i][j]=sc.nextInt();
}
}
}
for(i=0;i<m1;i++)
{
for(j=0;j<n2;j++)
{
 c[i][j]=0;
for(k=0;k<m2;k++)
{
  c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
}
}
}
System.out.println("resultant matrix:");
for(i=0;i<m1;i++)
{
for(j=0;j<n2;j++)
{
  System.out.println(c[i][j]);
}
}}
}