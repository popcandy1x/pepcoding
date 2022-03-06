/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class minfd
{
	public static void main(String[] args){
		Scanner fed=new Scanner(System.in);
		int t=fed.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=fed.nextInt();
			int x=fed.nextInt();
			int[] a=new int[n];
			for(int j=0;j<a.length;j++)
			{
				a[j]=fed.nextInt();
			}
			if(depositsSumm(a)<x)
			{
				System.out.println(-1);
			}
			else
			{
				int s=0,sum=0;
				while(sum<x)
				{
					sum+=maxDeposit(a);
				    int b=maxDepositIndex(a);
				    a[b]=0;
				    s++;
				}
				System.out.println(s);
			}
		}
		fed.close();
	}
	public static int maxDeposit(int[] a)
	{
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		return max;
	}
	public static int maxDepositIndex(int[] a)
	{
		int max=a[0];
		int maxindex=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				maxindex=i;
			}
		}
		return maxindex;
	}
	public static int depositsSumm(int[] a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		return sum;
	}
}
