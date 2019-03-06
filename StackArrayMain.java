//MOHD AFSAN AHMAD
//ROLL NO 55.CSB
//STACKARRAY
import java.io.*;
import java.util.*;

class StackArray
{
 private int[] arr;
 private int max;
 private int top;
 public StackArray(int n) throws IOException	
 {	
 	max=n;
 	top=-1;
 	arr=new int[max];
 }
 public void push(int x) throws IOException
 {
 	if(isfull())
 	{
 	 System.out.println("stack is overflow");
 	 int i=0;
 	 System.out.print("stack is : ");
 	 while(i<=top)
 	 {
 	  System.out.print(arr[i]+" ");
 	  i++;
 	 }
 	 System.out.println("\n");
 	}
 	else
 	{
 	 arr[++top]=x;
 	 System.out.println(x+" is pushed");
 	 int i=0;
 	 System.out.print("now stack is : ");
 	 while(i<=top)
 	 {
 	  System.out.print(arr[i]+" ");
 	  i++;
 	 }
 	 System.out.println("\n");
 	}
 
 }
 public void pop() throws IOException
 {
 	if(isempty())
 	{
 	 System.out.println("stack is underflow");
 	} 
 	else
 	{
 	 System.out.println(arr[top--]+" is popped");
 	 int i=0;
 	 System.out.print("now stack is : ");
 	 while(i<=top)
 	 {
 	   System.out.print(arr[i]+" ");
 	   i++;
 	 }
 	 System.out.println("\n");
 	}
 }
 public void peek() throws IOException
 {
 	if(isempty())
 	{
 	 System.out.println("stack is underflow");
 	}
 	else
 	{
 	int p=arr[top];
 	 System.out.println("peek value is : "+p);
 	arr[top]=p;
 	}
 }
 public boolean isfull() throws IOException
 {
 	if(top>=max-1)
 	  return true;
 	else
 	  return false;
 }
 public boolean isempty() throws IOException
 {
 	if(top==-1)
 	  return true;
 	else
 	  return false;
 }
 
}

class StackArrayMain
{
 public static void main(String[] args) throws IOException
  {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size stack :");
	int n=sc.nextInt();
        StackArray s = new StackArray(n);
        int c=0;
        do
        {
        	System.out.println("press 1 for push:");
        	System.out.println("press 2 for pop:");
        	System.out.println("press 3 for peek:");
        	System.out.println("press 4 to exit");
        	c=sc.nextInt();
        	switch(c)
        	{
        	 case 1: System.out.println("enter the number ");
			 int x=sc.nextInt();
			 s.push(x);
			 break;
		 
		 case 2:s.pop();
		 	break;
        	 
        	 case 3:s.peek();
        	 	break;
        	 	
        	 default : break;
        	}
        	 
	}while(c!=4);
  }

}
/*OUTPUT
 
 Enter the size stack :
10
press 1 for push:
press 2 for pop:
press 3 for peek:
press 4 to exit
1
enter the number 
9
9 is pushed
now stack is : 9 

press 1 for push:
press 2 for pop:
press 3 for peek:
press 4 to exit
2
9 is popped

press 1 for push:
press 2 for pop:
press 3 for peek:
press 4 to exit
2
stack is underflow
press 1 for push:
press 2 for pop:
press 3 for peek:
press 4 to exit
1
enter the number 
6
6 is pushed
now stack is : 6 

press 1 for push:
press 2 for pop:
press 3 for peek:
press 4 to exit
1
enter the number 
8
8 is pushed
now stack is : 6 8 

press 1 for push:
press 2 for pop:
press 3 for peek:
press 4 to exit
1
enter the number 
7
7 is pushed
now stack is : 6 8 7 

press 1 for push:
press 2 for pop:
press 3 for peek:
press 4 to exit
1
enter the number 
3
3 is pushed
now stack is : 6 8 7 3 

press 1 for push:
press 2 for pop:
press 3 for peek:
press 4 to exit
2
3 is popped
now stack is : 6 8 7 

press 1 for push:
press 2 for pop:
press 3 for peek:
press 4 to exit
3
peek value is : 7
press 1 for push:
press 2 for pop:
press 3 for peek:
press 4 to exit
2
7 is popped
now stack is : 6 8 

press 1 for push:
press 2 for pop:
press 3 for peek:
press 4 to exit
4
*/
