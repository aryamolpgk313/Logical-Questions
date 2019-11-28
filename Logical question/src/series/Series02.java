package series;

import java.util.Scanner;

public class Series02 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int a=0;
        for(int i=1;i<=n;i++)
        {
        	if(i%2!=0)
        	{
        	a=(i*i)-1;	
        	}
        	else
        	{
             a=(i*i)-2;	
        	}
        	System.out.printf("%d ",a);
        }
	}
}
