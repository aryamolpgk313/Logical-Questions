package companyquestions;

import java.util.Scanner;

public class Strong {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int temp=n;
		int sum=0;
		while(n>0)
		{
			int fact=1,i=1;
			int r=n%10;
			while(i<=r)
			{
				fact=fact*i;
				i++;
			}
			sum=sum+fact;
			n=n/10;
		}
		
       if(temp==sum)
       {
    	   System.out.println("Strong number");
       }
       else
       {
    	   System.out.println("Not a Strong number");  
       }
       
	}

}
