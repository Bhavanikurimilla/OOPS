import java.util.Scanner;
class Areas
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int opt;
Area_Methods a=new Area_Methods();
System.out.println("Enter 1.Circle 2.Square 3.Rectangle 4.Triangle For respective AREAS:");
System.out.println("-1 for exit ");
System.out.println();
do{
System.out.println("Enter your option:");
opt=sc.nextInt();
switch(opt)
{
case 1:
{
double pi=3.14;
System.out.println("Enter radius:");
double r=sc.nextDouble();
a.Area(pi,r);
break;
}
case 2:
{
System.out.println("Enter size of square:");
double s=sc.nextDouble();
a.Area(s);
break;
}
case 3:
{
System.out.println("Enter length and breadth of rectangle:");
float l=sc.nextFloat();
float b=sc.nextFloat();
a.Area(l,b);
break;
}
case 4:
{
System.out.println("Enter base and height of traingle:");
double b=sc.nextDouble();
float h=sc.nextFloat();
a.Area(b,h);
break;
}
default:
System.out.println("Exit!!!");
}
System.out.println();
}
while(opt!=-1);
}
}
class Area_Methods
{
public static void Area(double pi,double r)
{
double area=pi*r*r;
System.out.println("Area of Circle with r = "+r+" is "+area);
}
public static void Area(double s)
{
double area=s*s;
System.out.println("Area of Square with side = "+s+" is "+area);
}
public static void Area(float l,float b)
{
double area=l*b;
System.out.println("Area of Rectangle with l="+l+" , b="+b+" is "+area);
}
public static void Area(double b,float h)
{
double area=(0.5)*b*h;
System.out.println("Area of Triangle with b="+b+" , h="+h+" is "+area);
}
}