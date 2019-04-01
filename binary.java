//megha binary tree

import java.util.*;
class binary
{
	static class Node
	{
		int data;
		Node lChild;
		Node rChild;
		public Node(int d)
		{
			data=d;
			lChild=null;
			rChild=null;
		}
		public void displayNode()
		{
			System.out.print(data+" ");
		}
	}
	static class tree
	{
		Node root;
		public tree()
		{
			root=null;
		}
		public void insertElement(int d)
		{
			root=insert(root,d);
		}
		public Node insert(Node root,int d)
		{
			if(root==null)
			{
				root=new Node(d);
				return root;
			}
			if(d<root.data)
				root.lChild=insert(root.lChild,d);
			else if(d>root.data)
			{
				root.rChild=insert(root.rChild,d);
			}
			return root;
		}
		public void recInorder(Node troot)
		{
			if(troot!=null)
			{
				recInorder(troot.lChild);
				troot.displayNode();
				recInorder(troot.rChild);
			}
		}
		public void recPreorder(Node troot)
		{
			if(troot!=null)
			{
				troot.displayNode();
				recPreorder(troot.lChild);
				recPreorder(troot.rChild);
			}
		}
		public void recPostorder(Node troot)
		{
			if(troot!=null)
			{
				recPostorder(troot.lChild);
				recPostorder(troot.rChild);
				troot.displayNode();
			}
		}
		public void iterateInorder(Node troot)
		{
			Stack s=new Stack(20);
			do
			{
				while(troot!=null)
				{
					s.push(troot);
					troot=troot.lChild;
				}
				if(!s.isEmpty())
				{
					troot=s.pop();
					troot.displayNode();
					troot=troot.rChild;
				}
			}while(!s.isEmpty() || troot!=null);
			System.out.println();
		}
		public void iteratePreorder(Node troot)
		{
			Stack s=new Stack(20);
			s.push(troot);
			while(!s.isEmpty())
			{
				troot=s.pop();
				troot.displayNode();
				if(troot.rChild!=null)
					s.push(troot.rChild);
				if(troot.lChild!=null)
					s.push(troot.lChild);
			}
			System.out.println();
		}
		public void iteratePostorder(Node troot)
		{
			Stack s=new Stack(200);
			do
			{
				while(root!=null)
				{
					if(root.rChild!=null)
						s.push(root.rChild);
					s.push(root);
					root=root.lChild;
				}
				root=s.pop();
				if(root.rChild!=null && root.rChild==s.peek())
				{
					s.pop();
					s.push(root);
					root=root.rChild;
				}
				else
				{
					root.displayNode();
					root=null;
				}
			}while(!s.isEmpty());
			
		}
		public void run()
		{
			int c=0;
			Scanner scan=new Scanner(System.in);
			int n;
			System.out.println("Enter number of elements to be inserted : ");
			n=scan.nextInt();
			System.out.println("Enter the elements");
			for(int i=0;i<n;++i)
				insertElement(scan.nextInt());
			while(c!=7)
			{		
				System.out.println("\nEnter your choice(1-4)");
				System.out.println("1.Recursive Inorder");
				System.out.println("2.Recursive Preorder");
				System.out.println("3.Recursive Postorder");
				System.out.println("4.Non-Recursive Inorder");
				System.out.println("5.Non-Recursive Preorder");
				System.out.println("6.Non-Recursive Postorder");
				System.out.println("7.Exit");
				c=scan.nextInt();
				switch(c)
				{
					case 1:
						recInorder(root);
						break;
					case 2:
						recPreorder(root);
						break;
					case 3:
						recPostorder(root);
						break;
					case 4:
						iterateInorder(root);
						break;
					case 5:
						iteratePreorder(root);
						break;
					case 6:
						iteratePostorder(root);
						break;
					case 7:
						break;
					default:
						System.out.println("Error!!!");
				}
			
			}
		}
	}
	static class Stack
	{
		int max;
		Node[] data;
		int top;
		public Stack(int m)
		{
			max=m;
			data=new Node[max];
			top=-1;
		}
		public void push(Node j)
		{
			data[++top]=j;
		}
		public Node pop()
		{
			return (data[top--]);
		}
		public Node peek()
		{
			if(!isEmpty())
				return (data[top]);
			else
				return null;
		}
		public boolean isEmpty()
		{
			return (top==-1);
		}
	}
	public static void main(String args[])
	{
		tree obj=new tree();	
		obj.run();
	}
}
/*Enter number of elements to be inserted : 
6
Enter the elements
4
3
2
1
5
6

Enter your choice(1-4)
1.Recursive Inorder
2.Recursive Preorder
3.Recursive Postorder
4.Non-Recursive Inorder
5.Non-Recursive Preorder
6.Non-Recursive Postorder
7.Exit
1
1 2 3 4 5 6 
*/
