package series;

import java.util.Scanner;

public class Series04 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int a=4;int b=0;
		for(int i=0;i<n;i++)
		{
		b=a+(i*i);
		System.out.println(b);
		a=b;
		}
		
	}
}