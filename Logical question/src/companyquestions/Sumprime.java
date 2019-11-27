package companyquestions;

import java.util.Scanner;

public class Sumprime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the lower limit");
		int a=s.nextInt();
		System.out.println("Enter the upper limit");
		int b=s.nextInt();
		int i,j,f=0,sum=0;
		for(i=2;i<=b;i++)
        {
			f=1;
            for( j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    f=0;
                    break;
                }
                
            }
            if(f==1)
            {
            	sum=sum+i;
               
            }
        }
		 System.out.println("Sum is"+sum);
	}

}
