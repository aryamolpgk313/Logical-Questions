package companyquestions;

import java.util.Arrays;
import java.util.Scanner;

public class Uniquearray {

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
        	count=0;
          for(j=0;j<i-1;j++)
          {
          
        	  if(a[i]==a[j])
        	  {
        		  count++;
        		 
        	  }
        	  
           }
          for(k=i+1;k<n;k++)
          {
        	  if(a[i]==a[k])
        	  {
        		count++;  
        	  }
          }
          if(count==0)
          {
        	System.out.println(a[i]);  
          }
         }
	}
}

