
//MOHD AFSAN AHMAD
//ROLL NO 55.CSB
//PALINDROME
import java.io.*;
public class Palindrome
{
public static void main(String arg[]) throws IOException
 {
 InputStreamReader sr =new InputStreamReader(System.in);
 BufferedReader br = new BufferedReader(sr);
 String s=br.readLine();
 String s1=s;
//char[] c=s.toCharArray();
 int i=0;
 for(char h: s.toCharArray())
 {i++;
 }
int c=0;
 for(int j=0;j<i;j++)
  {
  
   if(s.charAt(j)==s1.charAt(i-j-1))
        {
	c++;
         System.out.println(s.charAt(j));
	}

  }
if(c==i)
 System.out.println("string is palindrome ");
else
 System.out.println("string is not palindrome ");


 }



 }
