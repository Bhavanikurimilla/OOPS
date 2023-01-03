import java.util.*;
class Account{
double acc_bal;
Account(double balance)
{
if(balance>0)
acc_bal=balance;
}
void credit(double c)
{
acc_bal=acc_bal+c;
System.out.println("Amount credited Successfully");
}
void debit(double d)
{
if(d>acc_bal)
System.out.println("Debit amount exceeds balance amount");
else
{
acc_bal=acc_bal-d;
System.out.println("Debited succesfully");
}
}
void getbalance()
{
System.out.println("Remaining balance = "+acc_bal);
}
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
String acc_name;
int acc_no;
String acc_add;
System.out.print("Enter the name of Account Holder:-");
acc_name=input.next();
System.out.print("Enter the Account number:-");
acc_no=input.nextInt();
System.out.print("Enter the Adress of Account Holder:-");
acc_add=input.next();
Account a=new Account(10000);
int k=0;
while(k!=4)
{
System.out.print("Enter 1 for credit 2 for withdawal 3 for get balance 4 for exit:-");
k=input.nextInt();
switch(k)
{
case 1:     double credit;
System.out.print("Enter the ammount to credit:-");
credit=input.nextInt();
a.credit(credit);
a.getbalance();
break;
case 2:      
            double debit;
System.out.print("Enter the ammount to debit:-");
debit=input.nextInt();
a.debit(debit)    ;
a.getbalance();
break;

case 3:  a.getbalance();
break;

case 4:
break;
default:
System.out.println("Enter the crct option");
break;
}
}
}
}
