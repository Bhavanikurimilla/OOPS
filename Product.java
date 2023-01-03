import java.util.*;
class Product
{
  int id,quantity;
  double price,total;
  String name;
void display()
{
  System.out.println("id" +id);
 System.out.println("name" +name);
 System.out.println("price" +price);

}
public static void main(String args[])
{
 int i,n;
 System.out.print("enter no.of products");
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
Product p[]=new Product[n];
for(i=0;i<n;i++)
{
p[i]=new Product();
 System.out.println("enter id ");
 p[i].id=sc.nextInt();
System.out.println("name");
 p[i].name=sc.next();
System.out.println("price");
 p[i].price=sc.nextDouble();
System.out.println("quantity");
 p[i].quantity=sc.nextInt();

}
for(i=0;i<n;i++)
{
System.out.println(p[i].id +"\t\t"+p[i].name +"\t\t"+p[i].quantity+"\t\t"+p[i].price);
}
int k,p_id,q;
double sum=00;
System.out.println("enter no.of products to buy");
k=sc.nextInt();
for(i=0;i<k;i++)
{
  System.out.println("enter product id");
  p_id=sc.nextInt();
System.out.println("enter product quantity");
  q=sc.nextInt();
 switch(p_id)
{
     case 1:sum=sum+(p[0].price*q);
            p[0].display();
           
            break;
     case 2:sum=sum+(p[1].price*q);
            p[1].display();
           
            break;
    case 3:sum=sum+(p[2].price*q);
            p[2].display();
 
            break;
	case 4:sum=sum+(p[3].price*q);
            p[3].display();
 
            break;
case 5:sum=sum+(p[4].price*q);
            p[4].display();

            break;
default:
  System.out.println("product not found");
            
}
}
System.out.println("total price" +sum);
}
  
  
}