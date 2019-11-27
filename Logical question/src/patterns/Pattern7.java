package patterns;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		for(int i=n;i>0;i--)
		{
		for(int j=i;j>0;j--)
		{
		System.out.printf("%c",j+64);
		}
		System.out.println();
		}
		sc.close();
	}

}
