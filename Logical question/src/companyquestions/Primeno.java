package companyquestions;

import java.util.Scanner;

public class Primeno {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int f=0,i=2;
		while(i<=n/2)
		{
			if(n%i==0)
			{
				f=1;
				break;
			}
			else
			{
				f=0;
			}
			i++;
		}
		
		if(f==0)
				{
			System.out.println("prime no");
				}
		else
		{
			System.out.println("not a prime no");
		}

	}

}
