//megha polynomials

import java.util.Scanner;
class polynomials
{
	static class Link
	{
		int coeff,exp;
		Link next;
		public Link(int c,int e)
		{
			coeff=c;
			exp=e;
			next=null;
		}
		public void displayLink()
		{
			System.out.print(coeff+"X^"+exp+" ");
		}
	}
	static class linkList
	{
		Link first;
		public linkList()
		{
			first=null;
		}
		public linkList addPoly(Link first2)
		{
			Link first1=first;
			linkList temp=new linkList();
			while(first1!=null && first2!=null)
			{
				if(first1.exp==first2.exp)
				{
					temp.insertLast(first1.coeff+first2.coeff,first1.exp);
					first1=first1.next;
					first2=first2.next;
				}
				else if(first1.exp>first2.exp)
				{
					temp.insertLast(first1.coeff,first1.exp);
					first1=first1.next;
				}
				else 
				{
					temp.insertLast(first2.coeff,first2.exp);
					first2=first2.next;
				}
			}
			if(first1!=null)
			{
				while(first1!=null)
				{
					temp.insertLast(first1.coeff,first1.exp);
					first1=first1.next;
				}
			}
			if(first2!=null)
			{
				while(first2!=null)
				{
					temp.insertLast(first2.coeff,first2.exp);
					first2=first2.next;
				}
			}
			return temp;
			
		}
		public void insertLast(int c,int e)
		{
			Link newLink=new Link(c,e);
			Link current=first;
			if(current==null)
			{
				first=newLink;
			}
			else
			{
				while(current.next!=null)
				{
					current=current.next;
				}
				current.next=newLink;
			}			
		}
		public void displayList()
		{
			Link current=first;
			while(current!=null)
			{
				current.displayLink();
					if(current.next!=null)
						System.out.print("+");
				current=current.next;
			}
			System.out.println();
		}	
	}
	public static void main(String args[])
	{
		int d,c;
		Scanner scan = new Scanner(System.in);
		linkList p1=new linkList();
		linkList p2=new linkList();
		linkList sum=new linkList();
		System.out.println("Enter the highest degree of first polynomial");
		d=scan.nextInt();
		System.out.println("Enter the coefficients of first polynomial:");
		for(int i=d;i>=0;--i)
		{
			System.out.print("X^"+i+" : ");
			c=scan.nextInt();
			if (c!=0)
				p1.insertLast(c,i);
		}
		System.out.println("Enter the highest degree of second polynomial");
		d=scan.nextInt();
		System.out.println("Enter the coefficients of second polynomial:");
		for(int i=d;i>=0;--i)
		{
			System.out.print("X^"+i+" : ");
			c=scan.nextInt();
			if (c!=0)
				p2.insertLast(c,i);
		}
		System.out.println();
		p1.displayList();
		System.out.println("+");
		p2.displayList();
		sum=p1.addPoly(p2.first);
		System.out.println("\n\nSum :");
		sum.displayList();
		
	}
}
/*Enter the highest degree of first polynomial
4
Enter the coefficients of first polynomial:
X^4 : 2
X^3 : 1
X^2 : 4
X^1 : 5
X^0 : 1
Enter the highest degree of second polynomial
6
Enter the coefficients of second polynomial:
X^6 : 4
X^5 : 2
X^4 : 3
X^3 : 1
X^2 : 7
X^1 : 6
X^0 : 5

2X^4 +1X^3 +4X^2 +5X^1 +1X^0 
+
4X^6 +2X^5 +3X^4 +1X^3 +7X^2 +6X^1 +5X^0 


Sum :
4X^6 +2X^5 +5X^4 +2X^3 +11X^2 +11X^1 +6X^0 

