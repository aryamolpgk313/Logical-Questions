package series;

import java.util.Scanner;

public class Series05 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int a=0;double b=0.5;
		System.out.println(a);
		for(int i=1;i<n;i++)
		{
			b=b*3;
			System.out.println(b);
			
		}
	}

}
