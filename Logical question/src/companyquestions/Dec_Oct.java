package companyquestions;

import java.util.Scanner;

public class Dec_Oct {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the decimal number");
		int bin=s.nextInt();
		String octal=Integer.toOctalString(bin);
		System.out.println("Octal value is "+octal);

	}

}
