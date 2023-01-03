import java.util.*;
class Circle
{
 double r;
double area()
{
 return (22/7)*r*r;
}
double perimeter()
{
 return 2*(22/7)*r;
}
}
class Main
{
 public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
Circle c=new Circle();
System.out.println("enter radius");
double R=sc.nextDouble();
c.r=R;
System.out.println(c.area());
System.out.println(c.perimeter());
}
}
 