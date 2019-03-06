
//MOHD AFSAN AHMAD
//ROLL NO 55.CSB
//POSTFIX EVALUATION
import java.util.*;
import java.io.*;
import java.lang.Math;
 
class StackEva{
	private int max;
	private double[] stackarray; //stack intialise
	private int top;
	public StackEva(int stacksize){
		max=stacksize;
		stackarray = new double	[max];
		top=-1;
	}
	public void push(double j){
		stackarray[++top]=j;
	}
	public double pop(){
		if(!isempty())
                    return stackarray[top--];
                 return -1;
	}
	public boolean isempty(){return (top ==-1);}
}

class Evaluation 
{ 
	// Method to evaluate value of a postfix expression 
	static double evaluatePostfix(String exp) 
	{ 
		//create a stack 
		StackEva stck = new StackEva(exp.length());
		
		// Scan all characters one by one 
		for(int i=0;i<exp.length();i++) 
		{ 
			char c=exp.charAt(i); 
			
			// If the scanned character is an operand (number here), 
			// push it to the stack. 
			if(Character.isDigit(c)) 
			stck.push(c - '0'); 
			
			// If the scanned character is an operator, pop two 
			// elements from stack apply the operator 
			else
			{ 
				double val1 = stck.pop(); 
				double val2 = stck.pop(); 
				
				switch(c) 
				{ 
					case '+': 
					stck.push(val2+val1); 
					break; 
					
					case '-':
					stck.push(val2- val1); 
					break; 
					
					case '/':
					stck.push(val2/val1); 
					break;
					
					case '*': 
					stck.push(val2*val1);
					break;
					case '$':
					stck.push(Math.pow(val2,val1));
					break; 
			       } 
			} 
		} 
		return stck.pop();	 
	} 
	
} 

class PostEvaMain{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the postfix :");
		String s=br.readLine();
		//InfixToPostfix thetrans=new InfixToPostfix(s);
		Evaluation eval = new Evaluation();
		double output=eval.evaluatePostfix(s);
		System.out.println("postfix evaluation is =>"+ output + "\n");
	}


}
/* OUTPUT

 enter the postfix :
1232$*+
postfix evaluation is =>19.0
*/


