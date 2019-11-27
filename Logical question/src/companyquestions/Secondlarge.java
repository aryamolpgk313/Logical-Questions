package companyquestions;

import java.util.Scanner;

public class Secondlarge {


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]=new int[25];
		int temp;int i=0;
		System.out.println("Enter the total elements");
		int n=s.nextInt();
		System.out.println("Enter the elements");
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
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		}
		}
		}
	System.out.println("Second largest element is "+a[n-2]);
        
	}

}
