package companyquestions;

import java.util.Scanner;

public class Reverseno {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int temp=n;
		int r;int sum=0;
		while(n!=0)
		{
		 r=n%10;
		 sum=(sum*10)+r;
		 n=n/10;
		}
       System.out.println("Reverse is "+sum);
	}

}
