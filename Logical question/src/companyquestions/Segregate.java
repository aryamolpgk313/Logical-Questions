package companyquestions;

import java.util.Arrays;
import java.util.Scanner;

public class Segregate {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of array elements");
		int n=s.nextInt();
		int a[]=new int[n];
		 int i,j;
		 int left=0;
		 int right=n-1;
		System.out.println("Enter the elements");
       
        for(i=0;i<n;i++)
        {
        	a[i]=s.nextInt();
        }
       while(left<right)
       {
    	   if (a[left]==0&&left<right)
    	   {
               left++; 
    	   }
    	   if (a[right]==1&&left<right)
    	   {
               right--;
    	   }
    	   if(left<right) 
           {
               a[left]=0;
               a[right]=1;
               left++;
               right--;
           }
       }
       System.out.println(Arrays.toString(a));
	}

}
