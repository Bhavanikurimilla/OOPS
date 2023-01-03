import java.util.*;
import java.lang.*;
class PalindromeString
{
   public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("enter string");
 String rev="";
 String num;
 int i,len;
 num=sc.nextLine();
 len=num.length();
 for(i=len-1;i>=0;i--)
{
  rev=rev+num.charAt(i);
}
if(num.equals(rev))
 System.out.println("palindrome");
else
System.out.println("not palindrome"); 
}
}