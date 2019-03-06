//MOHD AFSAN AHMAD
//ROLL NO 55.CSB
//STACKREVERSE
import java.io.*;
import java.util.*;

class StackReverse
{
 private char[] arr;
 private int max;
 private int top;
 public StackReverse(int l) throws IOException	
 {	
 	max=l;
 	top=-1;
 	arr=new char[max];
 }
 public void push(char x) throws IOException
 {
 	 arr[++top]=x;
 }
 public void pop() throws IOException
 {
 
 	while(top>=0)
 	{
 	System.out.print(arr[top--]);
 		
 	}
 	 System.out.println("");
 }

 
}

class StackReverseMain
{
 public static void main(String[] args) throws IOException
  {
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       
	System.out.println("Enter the string  :");
	String str=br.readLine();
	int l=str.length();
        StackReverse s = new StackReverse(l);
        int i=0;
        while(i<l)
        {
         char c=str.charAt(i);
              s.push(c);
              i++;	
        }
        System.out.print("reverse string is   :  ");
        s.pop();
        
  }

}
/*OUTPUT
 Enter the string  :
afsan
reverse string is   :  nasfa

Enter the string  :
naman
reverse string is   :  naman

Enter the string  :
hjgjhhjhjfh
reverse string is   :  hfjhjhhjgjh

Enter the string  :
asdfghjkl
reverse string is   :  lkjhgfdsa
*/
