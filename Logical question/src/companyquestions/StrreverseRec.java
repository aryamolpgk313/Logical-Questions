package companyquestions;

import java.util.Scanner;

public class StrreverseRec {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a string");
	String st=s.next();
	 String reverse=reverse(st);
     System.out.println(reverse);
	}

public static String reverse(String st)
{
	if(st.isEmpty())
	{
	return st;	
	}
	return reverse(st.substring(1))+st.charAt(0);
	}
}