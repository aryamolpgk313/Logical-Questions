package companyquestions;

import java.util.Scanner;

public class TempinC_F {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter temperature in Centigrade");
        double c=s.nextDouble();
        double f=(c*1.8)+32;
        System.out.println("The temperature in fahrenheit is "+f+" F");
	}

}
