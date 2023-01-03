import java.util.*;
class add
{ int a=10;
}
class add1 extends add
{
  int a=11;
 void display()
{
 System.out.println(super.a);
}
}
class Main
{
 public static void main(String args[])
{
 add1 ad=new add1();
ad.display();
}
}