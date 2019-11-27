package companyquestions;

import java.util.Scanner;

public class Maxelementarray {

	public static void main(String[] args) {
		 Scanner s=new Scanner (System.in);
		    System.out.println("Enter no of rows");
	     int row =s.nextInt();
	     System.out.println("Enter no of columns");
	    int col =s.nextInt();
	    int arr[][]=new int[row][col];
	   int i,j,largest=-1000;
	   System.out.println("Enter the elements");
	   for(i=0;i<row;i++)
	       {
	        for(j=0;j<col;j++)
	           {
	               arr[i][j]=s.nextInt();
	            }
	        }
	        for(i=0;i<row;i++)
	       {
	        for(j=0;j<col;j++)
	           {
	              if( arr[i][j]>largest)
	              {
	                  largest=arr[i][j];
	              }
	            }
	        }
	        System.out.printf("The maximum element is %d",largest);


	}

}
