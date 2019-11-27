package companyquestions;

import java.util.Scanner;

public class Delvowel {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String st=s.next();
		int length=st.length();
		int i;int f=0;
		String c="";
		for(i=0;i<length;i++)
		{
			char ch=st.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
			f=1;	
			}
			else
			{
				f=0;
				c=c+ch;
			}
		}
	
		System.out.println(c);
	}
	}


