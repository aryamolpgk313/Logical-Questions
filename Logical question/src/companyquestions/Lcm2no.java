package companyquestions;

import java.util.Scanner;

public class Lcm2no {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=s.nextInt();
		System.out.println("Enter the second number");
		int num2=s.nextInt();
		int gcd=0;
       for(int i=1;i<=num1&&i<=num2;i++)
       {
    	   if(num1%i==0&&num2%i==0)
    	   {
    		   gcd=i;
    	   }
       }
       int lcm=(num1*num2)/gcd;
       System.out.println("Lcm is "+lcm);
	}

}
