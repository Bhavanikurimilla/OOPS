class Callbyvalue
{
  int age=23;
void change_age(int age)
{
 age=age+10;
System.out.println(age);
}
public static void main(String args[])
{
 Callbyvalue c=new Callbyvalue();
System.out.println(c.age);
c.change_age(10);
System.out.println(c.age);

}
}