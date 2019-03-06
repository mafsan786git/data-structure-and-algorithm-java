//MOHD AFSAN AHMAD
//ROLL NO. 55 CS-B 
//BUBBLE SORT
import java.io.*;
import java.util.*;
class BubbleSort
{
 public void bubblesort(int a[],int n)
  {
      for(int i=0;i<n;i++)
	{
	 for(int j=0;j<n-i-1;j++)
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
  }

}
class BubbleSortMain
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
	Sort obj=new Sort();
	obj.selectionsort(a,n);
 } 
}
/* OUTPUT
enter the array size : 
10
enter the array element : 
9
8
7
5
6
4
10
2
3
1
sorted array is : 
1 2 3 4 5 6 7 8 9 10 
*/
