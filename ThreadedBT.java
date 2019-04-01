//meghas threaded bt

import java.io.*;
import java.util.*;
public class ThreadedBT
{

    public static Node root;

    public void insert(Node root, int id)
	{
        Node newNode = new Node(id);
        Node current = root;
        Node parent = null;
        while(true)
		{
            parent = current;
            if(id<current.data)
			{
                current = current.left;
                if(current==null)
				{
                    parent.left = newNode;
                    newNode.right = parent;
                    newNode.rightThread = true;
                    return;
                }
            }
			else
			{
                if(current.rightThread==false)
				{
                    current = current.right;
                    if(current==null)
					{
                        parent.right = newNode;
                        return;
                    }
                }
				else
				{
                    Node temp = current.right;
                    current.right = newNode;
                    newNode.right = temp;
                    newNode.rightThread=true;
                    return;
                }
            }
        }
    }

    public void print(Node root)
	{
        Node current = leftMostNode(root);
        while(current!=null)
		{
            System.out.print(" " + current.data);
            if(current.rightThread)
                current = current.right;
            else
                current = leftMostNode(current.right);
        }
        System.out.println();
    }

    public Node leftMostNode(Node node)
	{
        if(node==null)
		{
            return null;
        }
		else
		{
            while(node.left!=null)
			{
                node = node.left;
            }
            return node;
        }
    }

    public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the root element");
		int m = scan.nextInt();
        root = new Node(m);
        ThreadedBT st=new ThreadedBT();
		System.out.println("Enter the number of elements to be added to tree");
		int n = scan.nextInt();
		int x = 0;
		System.out.println("Enter the elements");
		for(int k = 0; k < n; k++)
		{
			x = scan.nextInt();
        	st.insert(root,x);
		}
		System.out.println("The Given Binary Tree is");
        st.print(root);
    }

}
class Node
{
    Node left;
    Node right;
    int data;
    boolean rightThread;
    public Node(int data)
	{
        this.data = data;
        rightThread = false;
    }
}

/*/*Enter the root element
5
Enter the number of elements to be added to tree
5
Enter the elements
2
25
1
3
6
The Given Binary Tree is
 1 2 3 5 6 25


