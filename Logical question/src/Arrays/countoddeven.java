package Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class countoddeven {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the size of the array:");
		int size=Integer.parseInt(br.readLine());
		int arr1[]=new int[size];
		//int arr2[]=new int[size];
		int i,j,evensum = 0,evencount = 0,oddsum = 0,oddcount = 0,even,odd;
        for(i=0;i<size;i++)
        {
        	arr1[i]=Integer.parseInt(br.readLine());
        }
        for(j=0;j<size;j++)
        {
        	if(arr1[j]%2==0)
        	{
        		System.out.println(arr1[j]);
        		evensum=evensum+arr1[j];
        		evencount++;
        	}
        	else
        	{
        		System.out.println(arr1[j]);
        		oddsum=oddsum+arr1[j];
        		oddcount++;
        	}
        	
        	
        }
           even=evensum/evencount;
           odd=oddsum/oddcount;
           
        	System.out.print("\nEven numbers Avarage:");
        	System.out.print(evensum/evencount);
        	System.out.print("\nOdd numbers count:");
        	System.out.print(oddsum/oddcount);
        }
	}
	
