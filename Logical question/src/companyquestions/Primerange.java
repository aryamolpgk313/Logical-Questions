package companyquestions;

import java.util.Scanner;

public class Primerange {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the lower limit");
		int a=s.nextInt();
		System.out.println("Enter the upper limit");
		int b=s.nextInt();
		int f;
        while(a<b)
        {
        	f=0;
        	for(int i=2;i<=a/2;i++)
        	{
        		if(a%i==0)
        		{
        			f=1;
        			break;
        		}
        	}
        	if(f==0)
        	{
        		System.out.println(a);
        	}
        	
        	a++;}
        
       }
}

