package companyquestions;

import java.util.Scanner;

public class Duplicatearray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of array elements");
		int n=s.nextInt();
		int a[]=new int[n];
		 int i,j,k,count;
		System.out.println("Enter the elements");
       
        for(i=0;i<n;i++)
        {
        	a[i]=s.nextInt();
        }
        for(i=0;i<n;i++)
        {
          for(j=i+1;j<n;j++)
          {
          
        	  if(a[i]==a[j])
        	  {
        		  
        		  System.out.println(a[j]); 
        	  }
        	  
           }
        }
	}
}

	


