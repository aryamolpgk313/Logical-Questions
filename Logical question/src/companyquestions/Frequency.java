package companyquestions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter a string");
        String st =s.nextLine().toUpperCase();
        for(char c='A';c<='Z';c++)
        {
            int count=0;
            for(int i=0;i<st.length();i++)
            {
                char x =st.charAt(i);
                if(x==c)
                    count++;
            }
            if(count>0)
            {
                System.out.println(c +"-" +count);
		
            }
	}

}
}