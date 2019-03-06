//MOHD AFSAN AHMAD
//ROLL NO 55.CSB
//ARRAYSUM
import java.util.*;
import java.io.*;
class Array
{
 public static void main(String args[]) throws IOException
 {
  Scanner sc = new Scanner(System.in);
  int a[];
  a=new int[50];
  System.out.println("enter the number of element ");
  int n=sc.nextInt();
   System.out.println("enter the  element of array : ");
   int s=0;
  for(int i=0;i<n;i++)
  {
   a[i]=sc.nextInt();
   s=s+a[i];
  }
  System.out.println("sum of array:  "+s);
  

 }

}
