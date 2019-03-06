//MOHD AFSAN AHMAD
//ROLL NO 55.CSB
//INFIX TO POSTFIX
import java.util.*;
import java.io.*;

class Stackx{
	private int max;
	private char[] stackarray; //stack intialise
	private int top;
	public Stackx(int stacksize){
		max=stacksize;
		stackarray = new char[max];
		top=-1;
	}
	public void push(char j){
		stackarray[++top]=j;
	}
	public char pop(){
        return stackarray[top--];
	}
	public boolean isempty(){return (top ==-1);}
}
class InfixToPostfix{  // inserting th operator in stack and operand in string
	private Stackx thestack;
	private String input;
	private String output = "";
	public InfixToPostfix(String s){
		input=s;
		int stacksize=s.length();
		thestack = new Stackx(stacksize);
	}

	public String dotrans()
	{
		for (int i=0;i<input.length() ;i++ ) {
			char ch = input.charAt(i);
			//thestack.displayStack("for "+ch+" ");

			switch(ch){
				case '+':
				case '-':
				gotoper(ch,1);
				break;
				case '*':
				case '/':
				gotoper(ch,2);
				break;
				case '$':
				gotoper(ch,3);
				break;

				case '(':
				thestack.push(ch);
				break;

				case ')':
				gotparen(ch);
				break;

				default:
				 output=output+ch;
				 break;
			}
			
		}
		while(!thestack.isempty()){
			//thestack.displayStack("while : ");
			output=output+thestack.pop();
		}
		return output;
	}
	public void gotoper(char opthis, int prec1){
		while(!thestack.isempty()){
			char optop=thestack.pop();
			if (optop=='(') {
				thestack.push(optop);
				break;
			}
			else
			{
				int prec2;
				if (optop=='+' || optop=='-') {
					prec2=1;
					
				}
				else if (optop=='*'|| optop=='/') {
					prec2=2;
					
				}
				else
					prec2=3;
			
				if (prec2<prec1) {
					thestack.push(optop);
					break;	
				}
				else
				{
					output=output+optop;
				}
			} 

		}
		thestack.push(opthis);
	}

	public void gotparen(char ch){
		while(!thestack.isempty())
		{
			char chx=thestack.pop();
			if (chx=='(') {
				break;
			}
			else
				output=output+chx;
		}
	}
}

class PostfixMain
{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the infix :");
		String s=br.readLine();
		InfixToPostfix thetrans=new InfixToPostfix(s);
		String output=thetrans.dotrans();
		System.out.println("postfix is =>"+ output + "\n");


	}
}
/*OUTPUT
 enter the infix :
1+2/6*4-2$5
postfix is =>126/4*+25$-

enter the infix :
A+B*C$D
postfix is =>ABCD$*+

enter the infix :
A+(B*C)
postfix is =>ABC*+


*/

