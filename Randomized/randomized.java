/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main(String[] args){
		Scanner xed=new Scanner(System.in);
		int x=xed.nextInt();
		for(int j=0;j<x;j++)
		{
			int t=xed.nextInt();
			int[] a=new int[t];
			for(int i=0;i<a.length;i++)
			{
			    a[i]=xed.nextInt();
			}
			int sum1=0,sum2=0;
			sum1=a[0];
			for(int i=1;i<a.length;i++)
			{
				sum2+=a[i];
			}
			int min=max(sum1,sum2);
			for(int i=1;i<a.length;i++)
			{
			    if(sum1<sum2)
				{
				    sum1+=a[i];
					sum2-=a[i];
					min=min(min,max(sum1,sum2));
				}
			    else
				{
					break;
				}
			}
// 			if(a.length==1)
// 			{
// 			    System.out.println(a[0]);
// 			}
// 			else
			System.out.println((long)min);
		}
		xed.close();
	}
	public static int min(int a,int b)
	{
		if(a<b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	public static int max(int a,int b)
	{
		if(a>b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
}
