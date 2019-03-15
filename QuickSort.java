import java.util.*;
import java.io.*;
import java.lang.*;

class QuickSort
{
	public int partition(int a[],int start,int end)
	{
		int pivote=a[end];
		int pindex=start;
		for(int i=start;i<end;i++)
		{
			if (a[i]<pivote) {

				int temp=a[i];
				a[i]=a[pindex];
				a[pindex]=temp;
				pindex=pindex+1;
			}
		}
		int temp=a[end];
		a[end]=a[pindex];
		a[pindex]=temp;
		return pindex;

	}

	public void sort(int a[],int start,int end)
	{
		//QuickSort o=new QuickSort();
		if (start<end) 
		{
			int pindex=partition(a,start,end);
			sort(a,start,pindex-1);
			sort(a,pindex+1,end);
			
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

	public static void main(String[] args) throws IOException
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array : ");
		int n=sc.nextInt();
		System.out.println("enter the element of array : ");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();

		}
		QuickSort ob=new QuickSort();
		ob.sort(a,0,n-1);
		System.out.print("sorted array is  : ");
		ob.print(a,n);

	}
}
