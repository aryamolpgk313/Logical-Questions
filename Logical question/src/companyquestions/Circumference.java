package companyquestions;

import java.util.Scanner;

public class Circumference {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the radius of circle");
        int r=s.nextInt();
        double pi=3.14;
        double circum=2*pi*r;
        System.out.println("The circumference is "+circum);
        
	}

}
