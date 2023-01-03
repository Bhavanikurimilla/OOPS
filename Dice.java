import java.util.*;
class Dice
{
 public static void main(String args[])
{
 int i,p1=0,p2=0,p3=0,p4=0,p5=0,p6=0;
 int d1,d2;
 Scanner sc=new Scanner(System.in);
 for(i=1;i<=10;i++)
{
 System.out.println("enter value of dice1:");
 d1=sc.nextInt();
 System.out.println("enter value of dice2:");
 d2=sc.nextInt();
 if(d1==1 && d2==1)
   p1++;
 else if(d1==2 && d2==2)
  p2++;
else if(d1==3 && d2==3)
  p3++;
else if(d1==4 && d2==4)
  p4++;
else if(d1==5 && d2==5)
  p5++;
else if(d1==6 && d2==6)
  p6++;
else
 continue;
}
System.out.println("\t"+1+"\t"+2+"\t"+3+"\t"+4+"\t"+5+"\t"+6);
System.out.println("freq"+"\t"+p1+"\t"+p2+"\t"+p3+"\t"+p4+"\t"+p5+"\t"+p6); 
System.out.println(p1+p2+p3+p4+p5+p6);
}
}
