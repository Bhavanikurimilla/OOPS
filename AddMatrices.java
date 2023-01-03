import java.util.*;
class AddMatrices
{
  int n,m,i,j;
  int a[][]= new int[10][10];
  int b[][]= new int[10][10];
int c[][]= new int[10][10];
Scanner sc=new Scanner(System.in);
 void read()
{
  System.out.println("enter n and m");
  n=sc.nextInt();
  m=sc.nextInt();
  System.out.println("enter 1st matrix");
  for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
  a[i][j]=sc.nextInt();
}
}
  System.out.println("enter 2nd matrix");
  for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
  b[i][j]=sc.nextInt();
}
}
}

void printMatrices()
{ 
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
  c[i][j]=a[i][j]+b[i][j];
}
}
  System.out.println("resultant matrix:");
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{

  System.out.println(c[i][j]);
}
}
}
}
class Main
{
  public static void main(String args[])
{
  AddMatrices am=new AddMatrices();
  am.read();
  am.printMatrices();
}
}