package companyquestions;

import java.util.Scanner;

public class Gcdarray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i;int gcd=0;
		System.out.println("Enter the no of elements");
		int n=s.nextInt();
        System.out.println("Enter the elements");
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
        	a[i]=s.nextInt();
        }
        int res=a[0];
       while(i<n)
       {
    	   if(a[i]%res==0)
    	   {
    		   i++;
    	   }
    	   else
    	   {
    		   res=a[i]%res;
    		   i++;
    	   }
       }
        System.out.println("GCD is "+res);
	}
}
