class Callbyref
{
  int age=23;
void change_age(Callbyref c)
{
 age=age+10;
System.out.println(age);
}
public static void main(String args[])
{
 Callbyref c=new Callbyref();
System.out.println(c.age);
c.change_age(c);
System.out.println(c.age);

}
}