package companyquestions;

import java.util.Scanner;

public class Secondgreatest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int num1=s.nextInt();
		int num2=s.nextInt();
		int num3=s.nextInt();
		int secgreat=0;
       if(num1>num2&&num1>num3)
       {
    	   if(num2>num3)
    	   {
    		   secgreat=num2;  
    	   }
    	   else
    	   {
    		   secgreat=num3;  
    	   }
       }
       else if(num2>num1&&num2>num3)
       {
    	   if(num1>num3)
    	   {
    		   secgreat=num1;
    	   }
    	   else
    	   {
    		   secgreat=num3;   
    	   }
       }
       else if(num1>num2)
       {
    	   secgreat=num1;  
       }
       else
       {
    	   secgreat=num2; 
       }
       System.out.println("The second gratest no is "+secgreat);
	}

}
