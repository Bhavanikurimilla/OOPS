import java.util.*;
class Thiskeyword
{
  Thiskeyword(int a,int b,int c)
{
 this(a,b);
System.out.println("c-" +c);
}
Thiskeyword(int a,int b)
{
 this(a);
System.out.println("b-"+b);
}
Thiskeyword(int a)
{
System.out.println("a-"+a);
}
}
class Main
{
public static void main(String args[])
{
Thiskeyword t=new Thiskeyword(1,2,3);
}
}