package Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arrayaddition {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the size of the array:");
		int size=Integer.parseInt(br.readLine());
		int arr1[]=new int[size];
		int arr2[]=new int[size];
		int i,j,k;
		System.out.printf("Enter array for %d for array1",size);
        for(i=0;i<size;i++)
        {
        	arr1[i]=Integer.parseInt(br.readLine());
        }
        System.out.printf("Enter array for %d for array2",size);
        for(j=0;j<size;j++)
        {
        	arr2[j]=Integer.parseInt(br.readLine());
        }
        for(j=0;j<size;j++)
        {
        	System.out.print(arr1[j]+arr2[j]);
        }
	}
	

}
