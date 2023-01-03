import java.util.Scanner;
class Vehicle
{
String Vehicle_no,Insurance_no,color;
double Consumption;
void set(String Vehicle_no,String Insurance_no,String color)
{
this.Vehicle_no=Vehicle_no;
this.Insurance_no=Insurance_no;
this.color=color;
}
void getConsumption(double Consumption)
{
this.Consumption=Consumption;
}
void Display_Consumption()
{
System.out.println("The Consumption RATE is "+this.Consumption);
}
}
class Two_Wheeler extends Vehicle
{
double average;
String Type,Name;
void maintenance()
{
System.out.println("*** Maintenance Notice ***");
System.out.println("All Checked with Engine and break oils.Have Regular Servicing");
}
void getType(String Type)
{
this.Type=Type;
}
void getName(String Name)
{
this.Name=Name;
}
void Details()
{
System.out.println("VEhicle no : "+super.Vehicle_no);
System.out.println("Insurance no : "+super.Insurance_no);
System.out.println("Color is "+super.color);
System.out.println("TYpe of Two_Wheeler is "+this.Type);
System.out.println("Name of Vehicle is "+this.Name);
Display_Consumption();
System.out.println("The Average of Your Two Wheeler is "+this.average);
maintenance();
}
}
class Geared extends Two_Wheeler
{
void average(double average)
{
super.average=average;
}
}
class NonGeared extends Two_Wheeler
{
void average(double average)
{
super.average=average;
}
}
 class Main
{
public static void main(String[] ar)
{
Scanner sc=new Scanner(System.in);
Geared t=new Geared();
NonGeared f=new NonGeared();
String Vehicle_no,Insurance_no,color,Type,Name;
double Consumption,avg;
System.out.println("Enter vehicle_no,Insurance_no,color,Type,Name of your Geared Two Wheeler:: ");
Vehicle_no=sc.next();
Insurance_no=sc.next();
color=sc.next();
Type=sc.next();
Name=sc.next();
System.out.println("Enter consumption and average of vehicle:");
Consumption=sc.nextDouble();
avg=sc.nextDouble();t.set(Vehicle_no,Insurance_no,color);
t.getType(Type);
t.getName(Name);
t.getConsumption(Consumption);
t.average(avg);
System.out.println();
t.Details();
System.out.println();
System.out.println("Enter vehicle_no,Insurance_no,color,Type,Name of your NonGEared Wheeler:: ");
Vehicle_no=sc.next();
Insurance_no=sc.next();
color=sc.next();

Type=sc.next();
Name=sc.next();
System.out.println("Enter consumption and average of vehicle:");
Consumption=sc.nextDouble();
avg=sc.nextDouble();
f.set(Vehicle_no,Insurance_no,color);
t.getType(Type);
t.getName(Name);
f.getConsumption(Consumption);
f.average(avg);
System.out.println();
f.Details();
}
}
