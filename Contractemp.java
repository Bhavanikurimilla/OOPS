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
int Salary;
public void getDept(String Department)
{
this.Department=Department;
}
public void getDesg(String Designation)

{
this.Designation=Designation;
}
public void DisplayFullName()
{
System.out.println("FullName is "+this.FirstName+" . "+this.LastName);
System.out.println("Your Department is "+this.Department);
System.out.println("You are "+this.Designation);
System.out.println("and Salary is "+this.Salary);
}
}
class HourlyEmployee extends ContractEmployee
{
int no_of_hours;
final int wage_per_hour=200;
void CalculateWages(int no_of_hours)
{
Salary=(no_of_hours*wage_per_hour)*30; 
}
}
class WeeklyEmployee extends ContractEmployee
{
int no_of_weeks;
final int wage_per_week=1500;
void CalculateWages(int no_of_weeks)
{
Salary=(no_of_weeks*wage_per_week);
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
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
Scanner sc1=new Scanner(System.in);
Scanner sc2=new Scanner(System.in);
System.out.println("Enter FirstName , Last Name of COntract hourly EMployee");
String FirstName=sc.nextLine();
String LastName=sc.nextLine();
System.out.println("Enter Department,no. of hours worked per day,Designation of COntract Employee");
String Department=sc.next();
int no_of_hours=sc.nextInt();
String Designation=sc.next();
HourlyEmployee emp1=new HourlyEmployee();
emp1.getFirstName(FirstName);
emp1.getLastName(LastName);
emp1.getDept(Department);
emp1.getDesg(Designation);
emp1.CalculateWages(no_of_hours);
System.out.println();
emp1.DisplayFullName();
System.out.println();
System.out.println("Enter FirstName , Last Name of COntract Weekly EMployee");
String FirstName3=sc2.nextLine();
String LastName3=sc2.nextLine();
System.out.println("Enter Department,no. of weeks worked,Designation of COntract Employee");
String Department3=sc2.next();
int no_of_weeks=sc2.nextInt();
String Designation3=sc2.next();
WeeklyEmployee emp3=new WeeklyEmployee();
emp3.getFirstName(FirstName3);
emp3.getLastName(LastName3);
emp3.getDept(Department3);
emp3.getDesg(Designation3);
emp3.CalculateWages(no_of_weeks);
System.out.println();
emp3.DisplayFullName();
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
