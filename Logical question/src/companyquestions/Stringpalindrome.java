package companyquestions;

import java.util.Scanner;

public class Stringpalindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String st=s.next();
		String rev="";
		for(int i=st.length()-1;i>=0;i--)
		{
			rev=rev+st.charAt(i);
			
		}
      if(rev.contentEquals(st))
      {
    	  System.out.println("Palindrome");
      }
      else
      {
    	  System.out.println("Not palindrome");
      }
	}

}
