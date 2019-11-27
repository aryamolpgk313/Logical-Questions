package companyquestions;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int temp=n;
		int a,b;
		int c=0;
        while(n!=0)
        {
        	a=n%10;
        	n=n/10;
        	c=c+a*a*a;
        }
        if(temp==c)
        {
        	System.out.println("Amstrong number");
        }
        else
        {
        	System.out.println("Not an amstrong number");	
        }
	}

}
