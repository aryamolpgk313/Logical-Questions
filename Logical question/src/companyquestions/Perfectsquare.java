package companyquestions;

import java.util.Scanner;

public class Perfectsquare {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int sq=(int)Math.sqrt(n);//square root
		int ps=sq*sq;//square of number
		if(ps==n)
		{
			System.out.println("Perfect square");
		}
		else
		{
			System.out.println("Not a Perfect square");
	
		}

	}

}
