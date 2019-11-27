package companyquestions;

import java.util.Scanner;

public class Deci_binary {

	
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the number");
			int n=s.nextInt();String x="";
			while(n>0)
			{
			int r=n%2;
			n=n/2;
			x=r+x;
			}
			System.out.print(x);

	}

}
