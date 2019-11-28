package series;

import java.util.Scanner;

public class Series06 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
        int a=0;int b=0;int k;int t=0;
         if(n%2==0)
         {
        	for(int i=1;i<=(n-2);i=i+2)
        	{
        	 a=a+2;
        	 b=a/2;
        	 
         }
        	System.out.println(b);
         }
         else
         {
        	 for(int i=1;i<=(n-2);i=i+2)
         	{
        		 a=a+2;
            	 b=a/2;	 
            }
        	 
        	 System.out.println(a);
         }
	}

}
