import java.util.*;
class Calci 
{
int a,b;
void read()
{
System.out.println("enter a,b:");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
}
void add()
{
 int c=a+b;
System.out.println("addition of 2 numbers is: " +c);
}
void sub()
{
 int s=a-b;
System.out.println("substraction of 2 numbers is: " +s);
}
void mult()
{
 int m=a*b;
System.out.println("multiplication of 2 numbers is: " +m);
}

void div()
{
 double d=a/b;
System.out.println("division of 2 numbers is: " +d);
}
}

class Main 
{
  public static void main(String[] args)
{
Calci cl=new Calci();
cl.read();
cl.add();
cl.sub();
cl.mult();
cl.div();
}
 }