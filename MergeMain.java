//MOHD AFSAN AHMAD
//ROLL NO 55.CSB
//MERGE SORT
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
		System.out.println("enter the size array :");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the element of array :");
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
			System.out.print(a[i]+" ");
		}
		System.out.println("");
	}
	

}
/*OUTPUT
enter the size array :
10
enter the element of array :
3 2 1 6 5 4 9 8 7 5
given array is now sorted
1 2 3 4 5 5 6 7 8 9 
*/
