package companyquestions;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the year");
		int n=s.nextInt();
		if(n%4==0)
		{
			if(n%100==0)
			{
				if(n%400==0)
				{
					System.out.println("Leap year");
				}
				else
				{
					System.out.println("Not leap year");	
				}
			}
			else
			{		
			System.out.println("Leap year");	
			}
			}
		else
		{
			System.out.println("Not leap year");	
		}
	}
}


