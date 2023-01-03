import java.util.*;
class CommandLine
{
 public static void main(String args[])
{
  int a,b,c;
  if(args.length==2)
{
  a=Integer.parseInt(args[0]);
  b=Integer.parseInt(args[1]);
  c=a+b;
  System.out.println(c);

}
}
}