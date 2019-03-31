import java.util.*;
import java.io.*;

class Priority
{
  private int maxsize;
  private int[] p;
  private int nitem;
  Priority(int n)
  {
    maxsize=n;
    p=new int[maxsize];
    nitem=-1;
  }
  public void insert(int item)
  {
    int i=0;
    if (nitem==-1) {
      p[++nitem]=item;
    } //end if
    else
    {
      for ( i=nitem;i>=0 ;i-- ) {
        if (item>p[i]) {
          p[i+1]=p[i];
        }
        else
          break;
      } //end for
      p[i+1]=item;
      nitem++;
    }
  }
  public int remove()
  {
    return p[nitem--];
  }
  public int peekmin()
  {
    return p[nitem];
  }
  public boolean isempty()
  {
    return nitem==-1;
  }
  public boolean isfull()
  {
    return (nitem==maxsize-1);
  }

}
class PriorityMain
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.println("enter the size of priority queue");
    n=sc.nextInt();
    Priority pr=new Priority(n);
    int c=0;
    do
    {
      System.out.println("1 insert\n"+"2 remove\n"+"3 for exit");
      c=sc.nextInt();
      switch(c)
      {
        case 1:if (pr.isfull()) {System.out.println("QUEUE is full .");}
               else
               {
                 System.out.println("enter the element ");
                 int x=sc.nextInt();
                 pr.insert(x);
               }
               break;
        case 2:if (pr.isempty()) {System.out.println("QUEUE is empty .");}
               else
               {
                 int x=pr.remove();
                 System.out.println(x);
                }
                break;
        default : break;
      }
    }while(c!=3);
    // while(!pr.isfull())
    // {
    //   System.out.println("enter the element ");
    //   int x=sc.nextInt();
    //   pr.insert(x);
    // }
    // System.out.println("queue in ascending : ");
    // while(!pr.isempty())
    // {
    //   int x=pr.remove();
    //   System.out.print(x+" ");
    // }
    // System.out.println("");
  }
}
