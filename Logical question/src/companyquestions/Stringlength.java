package companyquestions;

import java.util.Scanner;

public class Stringlength {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String st=s.next();
        int length=st.length();
        System.out.println("The length of the string is "+length);
	}
}
