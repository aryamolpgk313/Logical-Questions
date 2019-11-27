package companyquestions;

import java.util.Scanner;
import java.lang.Math;
public class Bin_dec {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the binary number");
		int bin=s.nextInt();
		int dec=0;int p=0;
		while(bin!=0)
		{
			dec=(int) (dec+((bin%10)*Math.pow(2,p)));
			bin=bin/10;
			p++;
		}
      System.out.println(dec);
	}
}
