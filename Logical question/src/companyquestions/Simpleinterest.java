package companyquestions;

import java.util.Scanner;

public class Simpleinterest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the amount");
		int amount=s.nextInt();
		System.out.println("Enter the no of years");
		int year=s.nextInt();
		System.out.println("Enter the rate of interest");
		double r=s.nextDouble();
		double interest=(double)(amount*year*r)/100;
		System.out.println("Simple interest is "+interest);
	}

}
