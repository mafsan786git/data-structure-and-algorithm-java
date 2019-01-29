import java.util.*;
import java.io.*;
import java.lang.*;
class MergeSort
{
	//MergeSort obj=new MergeSort();
	public void merge(int a[],int l,int m,int r) throws IOException
	{
		int n1=m-l+1;
		int n2=r-m;
		int L[]=new int[n1];
		int R[]=new int[n2];
		int i=0;
		for (i=0;i<n1;i++ )
		{
			L[i]=a[l+i];
			
		}
		for (i=0;i<n2;i++ )
		{
			R[i]=a[m+1+i];
			
		}
		i=0;
		int j=0;
		int k=l;
		while(i<n1 && j<n2)
		{
			if (L[i]<=R[j]) 
			{
				a[k]=L[i];
				i++;
			}
			else
			{
				a[k]=R[j];
				j++;
			}
			k++;
		}
		while(i<n1)
		{
			a[k]=L[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			a[k]=R[j];
			j++;
			k++;
		}

	}
	public void sort(int a[],int l,int r) throws IOException
	{
		int m=0;
		if (l<r)
		{
			m=(l+r)/2;
			sort(a,l,m);
			sort(a,m+1,r);
			merge(a,l,m,r);
		}

	}

}



class MergeMain
{
	public static void main(String[] args) throws IOException
	{
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//string s=br.readLine();
		//int n=Integer.parseInt(br.readLine());
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(n);
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			//a[i]=Integer.parseInt(br.readLine());
			a[i]=sc.nextInt();
		}
		int l=0;
		int r=n-1;
		MergeSort ob=new MergeSort();
		ob.sort(a,l,r);
		System.out.println("given array is now sorted");
		for (int i=0;i<n;i++ )
		{
			System.out.println(a[i]);
		}
	}
	

}