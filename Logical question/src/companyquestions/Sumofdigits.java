package companyquestions;

import java.util.Scanner;

public class Sumofdigits {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=s.nextInt();
		if(num==0)
		{
			System.out.println("Sum is "+num);
		}
		else if(num%9==0)
		{
			System.out.println("Sum is "+9);
		}
		else
		{
			System.out.println("Sum is "+num%9);
		}
	}

}
