import java.util.*;
class BinarySearch
{
public static void main(String args[])
{
	int i,j,first,middle,last,search,n;
	int a[]=new int[10];
        Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of array:");
	n=sc.nextInt();
	System.out.println("enter integers:");

	for(i=0;i<n;i++)
	{
           a[i]=sc.nextInt();
         }
		for(i=0;i<n;i++)
	{
		for(j=0;j<n-1;j++)
		{
			if(a[j]>a[j+1])
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
		System.out.println("sorted array is:");
	for(i=0;i<n;i++)
	{
	 	System.out.println(a[i]);
	}
        System.out.println("\nenter value to find:");
	 search=sc.nextInt();
	first=0;
	last=n-1;
		middle=(first+last)/2;

	
if(a[middle]<search)
{
    for(i=middle;i<n;i++)
	{
	if(a[i]==search)
	{
		System.out.println(search+"is at location" +i);
		break;
	}
    }
	if(i>=n)
	{
			System.out.println("\n key not found");
	}
}

else if(a[middle]>=search)
	{
		for(i=0;i<=middle;i++)
		{
	        if(a[i]==search)
        	{System.out.println(search+"is at location" +i);
		      break;
	        }
	   }
    	if(i>middle)
    	{
		System.out.println("not found");
     	}
	}}
}	
