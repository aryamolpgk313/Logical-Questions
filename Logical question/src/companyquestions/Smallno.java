package companyquestions;

import java.util.Scanner;

public class Smallno {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the  no of numbers");
        int n=s.nextInt();
        System.out.println("Enter the numbers");
        int a[]=new int[n];
        int small,i=0;
        for(i=0;i<n;i++)
        {
        	a[i]=s.nextInt();
        }
        for(i=0;i<n;i++)
        {
        	for(int j=i+1;j<n;j++)
        	{
        	if(a[i]>a[j])
        	{
        		small=a[i];
        		a[i]=a[j];
        		a[j]=small;
        	}
        	}
        }
       System.out.println("Smallest is "+a[0]); 	
	}

}
