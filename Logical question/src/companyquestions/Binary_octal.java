package companyquestions;

import java.util.Scanner;

public class Binary_octal {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the binary number");
	String bin=s.next();
	int bnum=Integer.parseInt(bin,2);
	String octal=Integer.toOctalString(bnum);
	System.out.println("Octal value is "+octal);
	

	}

}
