import java.util.*;
import java.lang.*;
class Staticmethod
{
 static
{
System.out.println("this is static block");
}
static void display()
{
System.out.println("this is static method");
}
static int a=5;
public static void main(String args[])
{
 System.out.println(a);
 Staticmethod.display();
}
}