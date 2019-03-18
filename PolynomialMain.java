//MOHD AFSAN AHMAD
//CSB 55
//POLYNOMIAL
import java.io.*;
import java.util.*;

class Node
{
	public int co;
	public int deg;
	public Node next;
	Node(int x,int y)
	{
		co=x;
		deg=y;
		next=null;
	}
}
class Polynomial
{
	public Node first=null;

	public void insert(int x,int y)
	{
		Node newlink=new Node(x,y);
		Node temp=first;
		if (temp==null) {
			first=newlink;
		}
		else{
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newlink;
		}
	}
	public void addition(Polynomial p1,Polynomial p2)
	{
		Node current1=p1.first;
		Node current2=p2.first;
		// if (current1==null) {return current1}
		// (current2==null)?return current1: (current1==null) ? return current2 : return current1;
		Polynomial add=new Polynomial();
		while(current1!=null && current2!=null)
		{

			if (current1.deg==current2.deg) {

				int coeff=current1.co+current2.co;
				insert(coeff,current1.deg);
				current1=current1.next;
				current2=current2.next;

			}
			else if (current1.deg> current2.deg) {

				insert(current1.co,current1.deg);
				current1=current1.next;
			}
			else {
				insert(current2.co,current2.deg);
				current2=current2.next;
			}
		}
		while(current1!=null){
			insert(current1.co,current1.deg);
			current1=current1.next;
		}
		while(current2!=null){
			insert(current2.co,current2.deg);
			current2=current2.next;
		}
		//return add;
	}


	public void display()
	{
		Node temp=first;
		if(temp==null) {
			System.out.println("list is empty ");
		}
		else
		{
			while(temp!=null)
			{
				if (temp.deg==0)
				{
					System.out.print(temp.co);
					break;
					// temp=temp.next;
				}
				else
				{
					if (temp.co!=0)
					{
						System.out.print(temp.co+"x^"+temp.deg);
					}
					temp=temp.next;
			  }
				if (temp!=null)
				{
					if (temp.co<=0)
					{
						System.out.print("");
					}
					else{System.out.print("+");}
				}
			}
		}
	}
}
class PolynomialMain
{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the number of elements of first Polynomial");
        int n=sc.nextInt();
        Polynomial p1=new Polynomial();
        Polynomial p2=new Polynomial();
        Polynomial p3=new Polynomial();
        int c=0;
        while(n>0)
        {

        	c++;
        	System.out.println("enter the coefficient and degree of "+c+" term");
        	int x=sc.nextInt();
        	int y=sc.nextInt();
        	p1.insert(x,y);
        	n--;
        }
        System.out.println("enter the number of elements of second Polynomial");
        int m=sc.nextInt();
        c=0;
        while(m>0)
        {

        	c++;
        	System.out.println("enter the coefficient and degree of "+c+" term");
        	int x=sc.nextInt();
        	int y=sc.nextInt();
        	p2.insert(x,y);
        	m--;
        }
        System.out.println("first list is ");
        p1.display();
				System.out.println("");
        System.out.println("second list is ");
        p2.display();
				System.out.println("");
        p3.addition(p1,p2);
        System.out.println("addition list is ");
        p3.display();
				System.out.println("");

	}
}
