import java.io.*;
import java.util.*;

public class stringcompression{

	public static String compression1(String str){
		String d=new String("");
		int b=0;
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			while(d.length()<1)
			{
				d+=c;
			}
			if(d.length()>=1)
			{
				if(c!=d.charAt(d.length()-1))
				{
				d+=c;
				}
			}
		}
		return d;
	}
	public static String compression2(String str){
		String d=new String("");
		int b=0;
		for(int i=0;i<str.length();i+=b)
		{
			char c=str.charAt(i);
			int k=0;
			for(int j=i;j<str.length();j++)
			{
				if(str.charAt(j)==c)
				{
					k++;
					b=k;
				}
				else
				break;
			}
			d+=c;
			if(k!=1)
			{
				d+=k;
			}
		}
		return d;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
		scn.close();
	}

}