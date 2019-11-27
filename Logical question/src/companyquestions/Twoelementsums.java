package companyquestions;

import java.util.Scanner;

public class Twoelementsums {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=s.nextInt();
		int a[]=new int[n];
        int sum1[]=new int[n];
        System.out.println("Enter the sum");
        int sum=s.nextInt();
        
        System.out.println("Enter the elements");
        int i=0,j=0;
        for(i=0;i<n;i++)
        {
        	a[i]=s.nextInt();
        }
        for(i=0;i<n;i++)
        {
        	for(j=i+1;j<n;j++)	
        	{
        		sum1[i]=a[i]+a[j];
        	}
        }
        for(i=0;i<n;i++)
        {
        	for(j=i+1;j<n;j++)	
        	{
        		if(sum1[i]==sum)
        		{
        			System.out.printf("%d %d ",a[i],a[j]);
        		}
        	}
        } 
	}
}