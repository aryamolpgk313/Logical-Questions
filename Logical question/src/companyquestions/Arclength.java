package companyquestions;

import java.util.Scanner;

public class Arclength {

	public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    double a;
    double pi=3.14;
    System.out.println("Enter the radius");
    double r=s.nextDouble();
    System.out.println("Enter the central angle");
    double c=s.nextDouble();
    a=2*pi*r*(c/360);
    System.out.printf("Arclength is %.3f",a);
	}

}
