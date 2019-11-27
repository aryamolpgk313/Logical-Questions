package patterns;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int length = s.length();
		char[] a = s.toCharArray();
		 for (int i = 0; i < length; i++)
		  {
		for (int j = 0; j <= i; j++)
		{
		 System.out.print(a[j]+" ");
		 }
		System.out.println();
		}
		 sc.close();
		 }
		 

		}
	


