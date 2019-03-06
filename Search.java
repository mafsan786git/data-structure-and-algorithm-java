//MOHD AFSAN AHMAD
//ROLL NO. 55 CS-B 
//SEARCH 
import java.util.*;
import java.io.*;
import java.lang.*;
public class Search
{
 public void linear(int a[],int n) throws IOException
 {	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter the element to be search : ");
	int key = Integer.parseInt(br.readLine());
	int c=0;
	for(int i=0;i<n;i++)
	{
	 if(key==a[i])
	   {
            c=i;
	    break;
           }
	}
	if(key==a[c])
	   System.out.println("the element you gave "+key+" is found at "+c);
	else
	   System.out.println(key+" is not found ");
 }
 public void binary(int a[],int n) throws IOException
 {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter the element to be search : ");
	int key = Integer.parseInt(br.readLine());
	int min=0;
        for(int i=0;i<n;i++)
	{
	 for(int j=i+1;j<n;j++)
	 {
		if(a[i]>a[j])
		{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		}
	 }
	}
        System.out.println("sorted array is : ");
	for(int i=0;i<n;i++)
	{
	System.out.print(a[i]+" ");
	}
	System.out.print("\n");
	int mid=0;
	int l=0,f=0;
	int r=n-1;
	while(r>=l)
	{
	 mid=(l+r)/2;
	if(key==a[mid])
	{f=1;
	 System.out.println(key+" is found at "+mid);
	 break;
 	}
	else if(key>a[mid])
		l=mid+1;
	else
		r=mid-1;
	}
        if(f==0)
	 System.out.println(key+" is not found .");
 }
}
class SearchMain
{
 public static void main(String arg[]) throws IOException
 {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter the array size : ");
	int n=Integer.parseInt(br.readLine());
	int a[]=new int[n];
	System.out.println("enter the array element : ");
	for(int i=0;i<n;i++)
	{
	 a[i]=Integer.parseInt(br.readLine());
	}
	System.out.println("enter 1 for linear search and 2 for binary search :");
	int ch=Integer.parseInt(br.readLine());
	Search obj=new Search();
	switch(ch)
	{
	case 1:obj.linear(a,n);
	case 2:obj.binary(a,n);

	}
 } 
}


/* OUTPUT
enter the array size : 
5
enter the array element : 
1
2
3
4
5
enter 1 for linear search and 2 for binary search :
1
enter the element to be search : 
4
the element you gave 4 is found at 3
----------
enter the array size : 
10
enter the array element : 
7
8
9
4
5
6
1
10
2
3
enter 1 for linear search and 2 for binary search :
2
enter the element to be search : 
7
sorted array is : 
1 2 3 4 5 6 7 8 9 10 
7 is found at 6
*/
