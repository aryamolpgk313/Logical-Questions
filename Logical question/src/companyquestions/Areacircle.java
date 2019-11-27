package companyquestions;

import java.util.Scanner;

public class Areacircle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        System.out.println("Enter the radius");
        double r=s.nextInt();
        double pi=3.14;
        double area=pi*(r*r);
		System.out.println("Area is "+area);
	}

}
