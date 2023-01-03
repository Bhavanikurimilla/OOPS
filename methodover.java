import java.util.Scanner;
class OverLoading
{
void display(int a)
{
System.out.println("The Integer Value is "+a);
}
void display(float b)
{
System.out.println("The float Value is "+b);
}
void riding()
{
System.out.println("I am Student of CSE");
}
}
class OverRiding extends OverLoading
{
void riding() 
{
System.out.println("Riding Method is overrided here!!!"); 
System.out.println("Iam B17 Batch Student"); 
}
}
class Main
{
public static void main(String[] ar)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Integer value:");
int a=sc.nextInt();
System.out.println("Enter Float Value:");
float b=sc.nextFloat();
OverLoading o1=new OverLoading();
OverRiding o2=new OverRiding();
o1.display(a);
o1.display(b);
o2.riding();
}
}