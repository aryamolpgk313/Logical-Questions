package companyquestions;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int gcd=0,i;
		System.out.println("Enter first number");
		int n1=s.nextInt();
		System.out.println("Enter second number");
		int n2=s.nextInt();
		for(i=1;i<=n1&&i<=n2;++i)
		{
			if(n1%i==0&& n2%i==0)
			{
				gcd=i;
			}
		}
		
    System.out.printf("Gcd of the numbers is %d",gcd);

	}

}
