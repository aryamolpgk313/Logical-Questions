package series;

import java.util.Scanner;

public class Series03 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
	 double a=1,b=2;
		System.out.println(a);
		System.out.println(b);
		for(int i=3;i<=n;i++)
		{
			if(i%2!=0)
			{
				a=a*3;
				System.out.println(a);		
			}
			else
			{
				b=b*3;
				System.out.println(b);
			}
		}
	}
}
