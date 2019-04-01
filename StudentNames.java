//megha threaded bt
import java.util.Scanner;
class StudentNames
{
	static class Node
	{
		String name;
		int rank;
		Node lChild;
		Node rChild;
		public Node(String s,int r)
		{
			name=s;
			rank=r;
			lChild=null;
			rChild=null;
		}
		public void displayNode()
		{
			System.out.println(name);
		}
	}
	static class tree
	{
		Node root;
		public tree()
		{
			root=null;
		}
		public void insertElement()
		{
			Scanner scan=new Scanner(System.in);
			String name;
			int rank;
			System.out.println("Enter student Name: ");
			name=scan.nextLine();
			System.out.println("Enter student Rank: ");
			rank=scan.nextInt();
			root=insert(root,name,rank);
		}
		public Node insert(Node root,String N,int r)
		{
			if(root==null)
			{
				root=new Node(N,r);
				return root;
			}
			if(r<root.rank)
				root.lChild=insert(root.lChild,N,r);
			else if(r>root.rank)
			{
				root.rChild=insert(root.rChild,N,r);
			}
			return root;
		}
		public void Search(int r)
		{
			Inorder(root,r);
		}
		public void Inorder(Node troot,int r)
		{
			if(troot!=null)
			{
				Inorder(troot.lChild,r);
				if(troot.rank==r)
					troot.displayNode();
				Inorder(troot.rChild,r);
			}
		}
		public void DisplayAll()
		{
		
			System.out.println("Rank\tName");
			Inorder_all(root);
		}
		public void Inorder_all(Node troot)
		{
			if(troot!=null)
			{
				Inorder_all(troot.lChild);
				System.out.print(troot.rank+".\t");
				troot.displayNode();
				Inorder_all(troot.rChild);
			}
		}
	}
	public static void main(String args[])
	{
		String name;
		int n,rank;
		int c=0;
		tree obj=new tree();
		Scanner scan=new Scanner(System.in);
		while(c!=4)
		{		
			System.out.println("\nEnter your choice(1-4)");
			System.out.println("1.Enter new student details");
			System.out.println("2.Search for student name");
			System.out.println("3.Display ranklist");
			System.out.println("4.Exit");
			c=scan.nextInt();
			switch(c)
			{
				case 1:
					obj.insertElement();
					break;
				case 2:
					System.out.print("Enter student Rank: ");
					rank=scan.nextInt();
					obj.Search(rank);
					break;
				case 3:
					obj.DisplayAll();
					break;
				case 4:	
					break;
				default:
					System.out.println("Error!!!");
			}
		}
	}
}
/*Enter your choice(1-4)
1.Enter new student details
2.Search for student name
3.Display ranklist
4.Exit
1
Enter student Name: 
megha
Enter student Rank: 
8

Enter your choice(1-4)
1.Enter new student details
2.Search for student name
3.Display ranklist
4.Exit
1
Enter student Name: 
rose
Enter student Rank: 
9

Enter your choice(1-4)
1.Enter new student details
2.Search for student name
3.Display ranklist
4.Exit
2
Enter student Rank: 9
rose

Enter your choice(1-4)
1.Enter new student details
2.Search for student name
3.Display ranklist
4.Exit
4

