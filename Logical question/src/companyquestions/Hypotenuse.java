package companyquestions;

import java.util.Scanner;

public class Hypotenuse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the base length");
		double b=s.nextDouble();
		System.out.println("Enter the altitude length");
		double a=s.nextDouble();
		double h=(a*a)+(b*b);
		double hy=Math.sqrt(h);
		System.out.printf("Hypotenuse is %.2f",hy);

	}

}
