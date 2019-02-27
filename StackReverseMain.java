import java.util.*;
import java.io.*;
class Stack
{
	private char[] a;
	private int max;
	private int top;
	public Stack(int s) throws IOException
	{
		max=s;
		top=-1;
		a = new char[max];
	}
	public void push(char d) throws IOException
	{
		if (isfull()) 
		{
			System.out.println("stack is overflow");
		}
		else
		{
			a[++top]=d;
		}
	}
	public char pop() throws IOException
	{
		if (isempty()) 
		{
			System.out.println("stack is underflow");
			return 0;
		}
		else
		{
			char d=a[top];
			top--;
			return d;
		}
	}
	public boolean isfull() throws IOException
	{
		if (top>=max-1) 
		{
			return true;
		}
		else
		{
			return false;
		}

	}
	public boolean isempty() throws IOException
	{
		if (top==-1) 
		{
			return true;
		}
		else
			return false;
	}


}

class StackReverseMain
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc = new Scanner(System.in);
		//System.out.println("enter size of stack");
		//char c=(char)br.read();;
		//int n=sc.nextInt();
		
		
		System.out.println("enter the string :  ");
		String c=br.readLine();
		
		int l=c.length();
		Stack s = new Stack(l);
		int i=0;
		while(i<l)
		{
			char x=c.charAt(i);
			//int x=sc.nextInt();
			s.push(x);
			i++;
		}
		i=0;
		// System.out.println("element of stack is : ");
		while(i<l) 
		{
			System.out.print(s.pop());
			i++;
		}
		System.out.print("\n");

		
	}
		
		
}