package companyquestions;

import java.util.Scanner;

public class Duplino {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]=new int[25];
		int i=0;
		System.out.println("Enter the no of elements");
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
			  if(a[i]==a[i+1])
			  {
			   a[j]=a[n-1];
			   n--;
			   j--;
			}
		}
System.out.println(a);
	}


	}
}
