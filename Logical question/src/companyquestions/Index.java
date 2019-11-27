package companyquestions;

import java.util.Scanner;

public class Index {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of array elements");
        int n=s.nextInt();
        int a[]=new int[n];
        int i=0;int f=0;
        System.out.println("Enter the array elements");
        for(i=0;i<n;i++)
        {
        	a[i]=s.nextInt();
        }
        System.out.println("Enter the element");
        int num=s.nextInt();
        for(i=0;i<n;i++)
        {
        	if(a[i]==num)
        	{
        	f=1;
        	break;
        	}
        	else
        	{
            f=0;		
            }
        	
	}
        if(f==1)
        {
        	System.out.println(i);
        }
        else
        {
        	System.out.println(-1);
        }
	}
}
        
	


