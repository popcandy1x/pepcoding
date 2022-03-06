/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main(String[] args){
		Scanner xed=new Scanner(System.in);
		int t=xed.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=xed.nextInt();
			int x=xed.nextInt();
			int y=xed.nextInt();
			int ncar=0,nbus=0,smokebus=0,smokecar=0;
			ncar=n/4;
			if(n%4!=0)
			{
				ncar+=1;
			}
			smokecar=ncar*y;
			nbus=n/100;
			if(n%100!=0)
			{
				nbus+=1;
			}
			smokebus=nbus*x;
			if(smokebus<=smokecar)
			{
				int d=smokebus/x;
				int e=d*100-n;
				int f=100-e;
				ncar=f/4;
				if(f%4!=0)
				{
					ncar+=1;
				}
				smokecar=ncar*y;
				System.out.println(smokebus+smokecar);
			}
			else
			{
				System.out.println(smokecar);
			}			
		}
	}
}
