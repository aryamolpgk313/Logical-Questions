package patterns;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		
			// TODO Auto-generated method stub
			System.out.println("Enter the number of rows: ");
			Scanner sc=new Scanner(System.in);
			   int rows = sc.nextInt();    
			   for (int i=1; i<= rows ; i++)
			   {
			    for (int j = rows; j > i ; j--)
			    {
			           System.out.print(" ");
			       }
			       System.out.print("*");
			       for (int k = 1; k < 2*(i -1) ;k++)
			       {
			        System.out.print(" ");
			       }
			       if( i==1)
			       {
			        System.out.println("");
			       }
			       else
			       {
			        System.out.println("*");
			       }
			       }
			   for (int i=rows-1; i>= 1 ; i--)
			       {
			       for (int j = rows; j > i ; j--)
			       {
			           System.out.print(" ");
			       }
			       System.out.print("*");
			       for (int k = 1; k < 2*(i -1) ;k++)
			       {
			           System.out.print(" ");
			       }
			       if( i==1)
			           System.out.println("");
			       else
			           System.out.println("*");
			   }
			   //
			   for (int i=1; i<= rows-1 ; i++)
			   {
			    for (int j = rows-1; j > i-1 ; j--)
			    {
			           System.out.print(" ");
			       }
			       System.out.print("*");
			       for (int k = 1; k < 2*(i -1) ;k++)
			       {
			        System.out.print(" ");
			       }
			       if( i==1)
			       {
			        System.out.println("");
			       }
			       else
			       {
			        System.out.println("*");
			       }
			       }
			   for (int i=rows-2; i>= 1 ; i--)
			       {
			       for (int j = rows-1; j > i-1 ; j--)
			       {
			           System.out.print(" ");
			       }
			       System.out.print("*");
			       for (int k = 1; k < 2*(i -1) ;k++)
			       {
			           System.out.print(" ");
			       }
			       if( i==1)
			           System.out.println("");
			       else
			           System.out.println("*");
			   }
			   sc.close();

	}

}
