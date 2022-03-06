import java.util.*;
import java.lang.*;
import java.io.*;

public class binsearch{
	public static void main(String[] args){
		Scanner xer=new Scanner(System.in);
		int t=xer.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=xer.nextInt();
			int[] b=new int[n];
			for(int k=0;k<b.length;k++)
			{
				b[k]=xer.nextInt();
			}
			Arrays.sort(b);
			int j=xer.nextInt();
			System.out.println(elementLocationSearcher(b,j));
		}
		xer.close();
	}
	public static int elementLocationSearcher(int[] a,int k){
		int l=0;
		int h=a.length-1;
		while(l<=h)
		{
			int m=(l+h)/2;
			if(k>a[m])
			{
				l=m+1;
			}
			else if(k<a[m])
			{
				h=m-1;
			}
			else
			{
				return m;
			}
		}
		return -1;
	}
}