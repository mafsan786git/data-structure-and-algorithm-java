//megha s nair
//deque

import java.util.Scanner;
class deque
{
	static class Link
	{
		int data;
		Link next;
		Link prev;
		public Link(int d)
		{
			data=d;
			next=null;
			prev=null;
		}
		public void displayLink()
		{
			System.out.print(data+" ");
		}
	}
	static class linkList
	{
		Link front;
		Link rear;
		public linkList()
		{
			front=null;
			rear=null;
		}
		public void insertFront(int d)
		{
			Link newLink=new Link(d);
			if (front==null)
			{
				front=newLink;
				rear=newLink;
			}
			else
			{
				newLink.next=front;
				front.prev=newLink;
				front=newLink;
			}
		}
		public void insertRear(int d)
		{
			Link newLink=new Link(d);
			if(rear==null)
			{
				front=newLink;
				rear=newLink;
			}
			else
			{
				newLink.prev=rear;
				rear.next=newLink;
				rear=newLink;
			}
		}
		public void deleteFront()
		{
			if(front==null)
				System.out.println("Empty Queue!!!");
			else if(front.next==null)
			{
				front=null;
				rear=null;
			}
			else
			{
				front=front.next;
				front.prev=null;
			}
		}
		public void deleteRear()
		{
			if(rear==null)
				System.out.println("Empty Queue!!!");
			else if(rear.prev==null)
			{
				front=null;
				rear=null;
			}
			else
			{
				rear=rear.prev;
				rear.next=null;
			}
		}
		public void displayQueue()
		{
			Link current=front;
			if(front==null)
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
		int c=0,d;
		linkList dqueue=new linkList();
		Scanner scan=new Scanner(System.in);
		while(c!=6)
		{
			System.out.println("Enter your choice(1-4):");
			System.out.println("1.Insert Front");
			System.out.println("2.Insert Rear");
			System.out.println("3.Delete Front");
			System.out.println("4.Delete Rear");
			System.out.println("5.Display Queue");
			System.out.println("6.Exit");
			c=scan.nextInt();
			switch(c)
			{
				case 1:
					System.out.print("Enter the element to be inserted : ");
					d=scan.nextInt();
					dqueue.insertFront(d);
					break;
				case 2:
					System.out.print("Enter the element to be inserted : ");
					d=scan.nextInt();
					dqueue.insertRear(d);
					break;
				case 3:
					dqueue.deleteFront();Enter your choice(1-4):


					break;
					case 4:
					dqueue.deleteRear();
					break;
				case 5:
					dqueue.displayQueue();
					break;
				case 6:
					break;
				default:
					System.out.print("Error!!!");
			}			
		}
	}		
}
/*//1.Insert Front
2.Insert Rear
3.Delete Front
4.Delete Rear
5.Display Queue
6.Exit
1
Enter the element to be inserted : 2
Enter your choice(1-4):
1.Insert Front
2.Insert Rear
3.Delete Front
4.Delete Rear
5.Display Queue
6.Exit
1
Enter the element to be inserted : 3
Enter your choice(1-4):
1.Insert Front
2.Insert Rear
3.Delete Front
4.Delete Rear
5.Display Queue
6.Exit
2
Enter the element to be inserted : 5
Enter your choice(1-4):
1.Insert Front
2.Insert Rear
3.Delete Front
4.Delete Rear
5.Display Queue
6.Exit
2
Enter the element to be inserted : 7
Enter your choice(1-4):
1.Insert Front
2.Insert Rear
3.Delete Front
4.Delete Rear
5.Display Queue
6.Exit
5
3 2 5 7 
Enter your choice(1-4):
1.Insert Front
2.Insert Rear
3.Delete Front
4.Delete Rear
5.Display Queue
6.Exit
3
Enter your choice(1-4):
1.Insert Front
2.Insert Rear
3.Delete Front
4.Delete Rear
5.Display Queue
6.Exit
5
2 5 7 
Enter your choice(1-4):
1.Insert Front
2.Insert Rear
3.Delete Front
4.Delete Rear
5.Display Queue
6.Exit
6*/
