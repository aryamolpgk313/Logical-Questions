package companyquestions;

import java.util.Scanner;

public class Nfibonacci {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int c=0;int a=0,b=1;int i=0;
      while(i<n)
      {
    	  System.out.println(a);
    	  c=a+b;
          a=b;
    	  b=c;
    	  i++;
      }
     
	}

}
