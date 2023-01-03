import java.util.Scanner;
class Employee
{
String FirstName;
String LastName;
public void getFirstName(String FirstName)
{
this.FirstName=FirstName;
}
public void getLastName(String LastName)
{
this.LastName=LastName;
}
}
class ContractEmployee extends Employee
{
String Department;
String Designation;
double Salary;
public void getDept(String Department)
{
this.Department=Department;
}
public void getDesg(String Designation,double Salary)
{
this.Designation=Designation;
this.Salary=Salary;
}
public void DisplayFullName()
{
System.out.println("FullName is "+this.FirstName+" . "+this.LastName);
System.out.println("Your Department is "+this.Department);
System.out.println("You are "+this.Designation);
System.out.println("and Salary is "+this.Salary);
}
}
class Regular_Employee extends Employee
{
String Department;
String Designation;
double Salary;
public void getDept(String Department)
{
this.Department=Department;
}
public void getDesg(String Designation,double Salary)
{

this.Designation=Designation;
this.Salary=Salary;
}
public void DisplayFullName()
{
System.out.println("FullName is "+this.FirstName+" . "+this.LastName);
System.out.println("Your Department is "+this.Department);
System.out.println("You are "+this.Designation);
System.out.println("and Salary is "+this.Salary);
}
}
class Main
{
public static void main(String[] ar)
{
Scanner sc=new Scanner(System.in);
Scanner sc1=new Scanner(System.in);
System.out.println("Enter FirstName , Last Name of COntract EMployee");
String FirstName=sc.nextLine();
String LastName=sc.nextLine();
System.out.println("Enter Department,Salary,Designation of COntract Employee");
String Department=sc.next();
double Salary=sc.nextDouble();
String Designation=sc.next();
ContractEmployee emp1=new ContractEmployee();
emp1.getFirstName(FirstName);
emp1.getLastName(LastName);
emp1.getDept(Department);
emp1.getDesg(Designation,Salary);
System.out.println();
emp1.DisplayFullName();
System.out.println();
System.out.println("Enter FirstName , Last Name of REgular EMployee");
String FirstName2=sc1.nextLine();
String LastName2=sc1.nextLine();
System.out.println("Enter Department,Salary ,Designation of Regular Employee");
String Department2=sc1.next();
double Salary2=sc1.nextDouble();
String Designation2=sc1.next();
Regular_Employee emp2=new Regular_Employee();
emp2.getFirstName(FirstName2);
emp2.getLastName(LastName2);
System.out.println();
emp2.getDept(Department2);
emp2.getDesg(Designation2,Salary2);
emp2.DisplayFullName();
}
}