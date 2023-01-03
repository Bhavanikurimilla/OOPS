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
void maintenance()
{
System.out.println("*** Maintenance Notice ***");
System.out.println("All Checked with Engine and break oils.Have Regular Servicing");
}
void average(double average)
{
this.average=average;
}
void Details()
{
System.out.println("VEhicle no : "+super.Vehicle_no);
System.out.println("Insurance no : "+super.Insurance_no);
System.out.println("Color : "+super.color);Display_Consumption();
System.out.println("The Average of Your Four Wheeler is "+this.average);maintenance();
}
}
class Four_Wheeler extends Vehicle
{
double average;
void maintenance()
{
System.out.println("*** Maintenance Notice ***");
System.out.println("All Checked.Have a Regular Serivicing");
}
void average(double average)

{
this.average=average;
}
void Details()
{
System.out.println("VEhicle no : "+super.Vehicle_no);
System.out.println("Insurance no : "+super.Insurance_no);
System.out.println("Color : "+super.color);
Display_Consumption();
System.out.println("The Average of Your Four Wheeler is "+this.average);
maintenance();

}

}
class Main
{
public static void main(String[] ar)
{
Scanner sc=new Scanner(System.in);
Two_Wheeler t=new Two_Wheeler();
Four_Wheeler f=new Four_Wheeler();
String Vehicle_no,Insurance_no,color;
double Consumption,avg;
System.out.println("Enter vehicle_no,Insurance_no,color of your Two Wheeler:: ");
Vehicle_no=sc.next();
Insurance_no=sc.next();
color=sc.next();
System.out.println("Enter consumption and average of vehicle:");
Consumption=sc.nextDouble();
avg=sc.nextDouble();
t.set(Vehicle_no,Insurance_no,color);
t.getConsumption(Consumption);t.average(avg);
System.out.println();
t.Details();
System.out.println();
System.out.println("Enter vehicle_no,Insurance_no,color of your Four Wheeler:: ");
Vehicle_no=sc.next();
Insurance_no=sc.next();
color=sc.next();
System.out.println("Enter consumption and average of vehicle:");
Consumption=sc.nextDouble();
avg=sc.nextDouble();
f.set(Vehicle_no,Insurance_no,color);
f.getConsumption(Consumption);
f.average(avg);
System.out.println();
f.Details();
}
}
