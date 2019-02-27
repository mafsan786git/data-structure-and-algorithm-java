import java.util.*;
import java.io.*;
class Stack
{
	private int[] a;
	private int max;
	private int top;
	public Stack(int s) throws IOException
	{
		max=s;
		top=-1;
		a = new int[max];
	}
	public void push(int d) throws IOException
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
	public int pop() throws IOException
	{
		if (isempty()) 
		{
			System.out.println("stack is underflow");
			return -1;
		}
		else
		{
			int d=a[top];
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

class StackMain
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of stack");
		int n=sc.nextInt();
		Stack s = new Stack(n);
		System.out.println("enter element of stack");
		for (int i=0;i<n ;i++ ) 
		{
			int x=sc.nextInt();
			s.push(x);
		}
		// System.out.println("element of stack is : ");
		for (int i=0;i<n ;i++ ) 
		{
			System.out.println("element of stack is : "+s.pop());
		}

		
	}
}