//meghas priority queue

import java.util.Scanner;
class priorityQueue
{
	static class Link
	{
		int data;
		int pr;
		Link next;
		public Link(int d,int p)
		{
			data=d;
			pr=p;
			next=null;
		}
		public void displayLink()
		{
			System.out.print(data+" ");
		}
	}
	static class linkList
	{
		Link first;
		public linkList()
		{
			first=null;
		}
		public void insertElement(int d,int p)
		{
			Link current=first;
			Link newLink=new Link(d,p);
			if(first==null)
				first=newLink;
			else if(newLink.pr<current.pr)
			{
				newLink.next=first;
				first=newLink;
			}	
			else
			{
				
				while(current!=null)
				{
					if(current.next==null)
					{
						current.next=newLink;
						break;	
					}
					else if(newLink.pr<current.next.pr)
					{
						newLink.next=current.next;
						current.next=newLink;
						break;
					}
					current=current.next;
				}
			}
		}
		public void deleteElement()
		{
			if(first==null)
				System.out.println("Empty Queue!!!");
			else
				first=first.next;
		}
		public void displayElements()
		{
			Link current=first;
			if(first==null)
				System.out.println("Empty Queue!!!");
			else
				while(current!=null)
				{
					current.displayLink();
					current=current.next;
				}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		int c=0,d,p;
		linkList pQueue=new linkList();
		Scanner scan=new Scanner(System.in);
		while(c!=4)
		{	
			System.out.println("Enter your choice(1-4):");
			System.out.println("1.Enter element");
			System.out.println("2.Delete element");
			System.out.println("3.Display Queue");
			System.out.println("4.Exit");
			c=scan.nextInt();
			switch(c)
			{
				case 1:
					System.out.println("Enter the data and its priority");
					d=scan.nextInt();
					p=scan.nextInt();
					pQueue.insertElement(d,p);
					break;
				case 2:
					pQueue.deleteElement();
					break;
				case 3:
					pQueue.displayElements();
					break;
				case 4:
					break;
				default:
					System.out.println("Error!!!");
					break;
			}
		}
	}
}
/*Enter your choice(1-4):
1.Enter element
2.Delete element
3.Display Queue
4.Exit
1
Enter the data and its priority
5
4
Enter your choice(1-4):
1.Enter element
2.Delete element
3.Display Queue
4.Exit
1
Enter the data and its priority
6
3
Enter your choice(1-4):
1.Enter element
2.Delete element
3.Display Queue
4.Exit
1
Enter the data and its priority
8
5
Enter your choice(1-4):
1.Enter element
2.Delete element
3.Display Queue
4.Exit
3
6 5 8 
Enter your choice(1-4):
1.Enter element
2.Delete element
3.Display Queue
4.Exit
2
Enter your choice(1-4):
1.Enter element
2.Delete element
3.Display Queue
4.Exit
2
Enter your choice(1-4):
1.Enter element
2.Delete element
3.Display Queue
4.Exit
2
Enter your choice(1-4):
1.Enter element
2.Delete element
3.Display Queue
4.Exit
3
Empty Queue!!!

Enter your choice(1-4):
1.Enter element
2.Delete element
3.Display Queue
4.Exit
4

