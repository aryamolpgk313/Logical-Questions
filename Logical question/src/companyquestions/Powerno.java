package companyquestions;

import java.util.Scanner;

public class Powerno {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		System.out.println("Enter the power value");
		int p=s.nextInt();
		int result=(int) Math.pow(num,p);
		System.out.println("The power is "+result);

	}
}
