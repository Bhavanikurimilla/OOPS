import java.util.*;
import java.lang.*;
class QuadraticRoots
{
public static void main(String args[])
{
int a,b,c;
System.out.println("enter a,b,c values to find roots:");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
double r1,r2;
r1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
r2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
System.out.println("root1: "+r1+ "and " + "root2: " +r2);

}

}