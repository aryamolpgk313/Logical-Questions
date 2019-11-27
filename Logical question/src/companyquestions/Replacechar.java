package companyquestions;

import java.util.Scanner;

public class Replacechar {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the elements");
		String st=s.next();
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='b'||ch[i]=='a'||ch[i]=='c')
			{
				ch[i]='*';
			}
		}
		for(int i=0;i<ch.length;i++)
		{
		System.out.println(ch[i]);
		}
		}
		

	}


