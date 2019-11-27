package companyquestions;

import java.util.Scanner;

public class Palindromeno {

	public static void main(String[] args) {
		
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=s.nextInt();
    int r;
    int sum=0;
    int temp=n;
    while(n!=0)
    {
    r=n%10;
    sum=(sum*10)+r;
    n=n/10;
    }
    if(temp==sum)
    {
    	System.out.println("Palindrome");
    }
    else
    {
    	System.out.println("Not Palindrome");	
    }
	}
}
