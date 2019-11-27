package companyquestions;

import java.util.Scanner;

public class Nthfibonacci {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int a=0,b=1,c=0;
      for(int i=2;i<n;i++)
      {
    	  c=a+b;
    	  a=b;
    	  b=c;
    	  
      }
      System.out.println(c);
	}

}
