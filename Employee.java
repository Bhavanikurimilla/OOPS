import java.util.*;
class Employee
{
 int age,id,salary;
 String name,gender,desig,address;
void displayinfo()
{
System.out.println("id" + id);
System.out.println("name" + name);
System.out.println("age" + age);
System.out.println("gender" + gender);
System.out.println("desig" + desig);
System.out.println("salary" + salary);
System.out.println("address" + address);
}
public static void main(String args[])
{
 int i,n;
 System.out.print("enter no.of employeess");
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
Employee e[]=new Employee[n];
for(i=0;i<n;i++)
{
e[i]=new Employee();
 System.out.println("enter id");
 e[i].id=sc.nextInt();
System.out.println("name");
 e[i].name=sc.next();
System.out.println("age");
 e[i].age=sc.nextInt();
System.out.println("gender");
 e[i].gender=sc.next();
System.out.println("desig");
 e[i].desig=sc.next();
System.out.println("salary");
 e[i].salary=sc.nextInt();
System.out.println("address");
 e[i].address=sc.nextLine();
}
int k;
System.out.println("enter id to find details");
k=sc.nextInt();
for(i=0;i<n;i++)
{
 if(e[i].id==k)
{
e[i].displayinfo();
break;
 }
 }
 }
}