package Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class biggestelement {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the size of the array:");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		int i,j,b = 0;
        for(i=0;i<size;i++)
        {
        	arr[i]=Integer.parseInt(br.readLine());
        }

       for(j=0;j<size;j++)
       {
    	   if(arr[j]>b)
    	   {
    		   b=arr[j];
    	   }
    	   
       }
       System.out.println("The greatest value is:"+b);
    	   
	}

}
