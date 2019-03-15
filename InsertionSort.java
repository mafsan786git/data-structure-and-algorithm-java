import java.util.*;
import java.io.*;

class InsertionSort
{
	public void sort(int a[],int n)
	{
		int value;
		int vc;

		for(int i=1;i<n;i++)
		{
			value=a[i];
			vc=i;
			while(vc>0 && a[vc-1]>value)
			{
				a[vc]=a[vc-1];
				vc=vc-1;
			}
			a[vc]=value;
		}
	}
	public void print(int a[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");

		}
		System.out.println("");
	}
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the array size : ");
		int n=sc.nextInt();
		System.out.println("enter the array element : ");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();

		}
		InsertionSort ob=new InsertionSort();
		ob.sort(a,n);
		System.out.print("sorted array is  : ");
		ob.print(a,n);

		
	}
}