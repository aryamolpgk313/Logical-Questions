package companyquestions;

import java.util.Scanner;

public class Searchnoarray {

	public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
         System.out.println("Enter the no of elements");
         int n=s.nextInt();
         int a[]=new int[n];
         System.out.println("Enter the elements");
         
         int i,temp,f=0;
         for(i=0;i<n;i++)
         {
        	 a[i]=s.nextInt();
         }
         System.out.println("Enter the element to be searched");
         int num=s.nextInt();
         for(i=0;i<n;i++)
         {
        	 if(a[i]==num)
        	 {
        		f=1;
        		break;
        	 }
         }
         if(f==1)
         {
        	 System.out.println("Element found at "+(i));
         }
         else
         {
        	 System.out.println("Element not found");	 
         }    
	}
}
