package Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class secondbiggestnum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the size of the array:");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		int i,j,b = 0,b1 = 0,k;int t=0;
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
       for(k=0;k<size;k++)
       {
    	   
		if(arr[k]<b&&b>=t)
    	   {
    		   t=arr[k];
    	   }
    	   
       }
       System.out.println("The second biggest value is:"+t);
	}

}

