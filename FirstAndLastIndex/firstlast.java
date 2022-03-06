import java.util.*;

public class firstlast{
	public static void main(String[] args){
		Scanner xed=new Scanner(System.in);
		int t=xed.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=xed.nextInt();
			int[] a=new int[n];
			for(int j=0;j<a.length;j++)
			{
				a[j]=xed.nextInt();
			}
			Arrays.sort(a);
			int j=xed.nextInt();
			System.out.println(firstIndexFinder(a,j));
			System.out.println(lastIndexFinder(a,j));
		}
		xed.close();
	}
	public static int lastIndexFinder(int[] a,int d){
		int l=0,h=a.length-1,k=(l+h)/2;
		while(a[l]<=d)
		{
			k=(l+h)/2;
			if(d>a[k])
			{
				l=k+1;
			}
			else if(d<a[k])
			{
				h=k-1;
			}
			else
			{
				l=k+1;
			}
		}
		if(a[l-1]==d)
		{
			return l-1;
		}
		else
		{
			return -1;
		}
	}
	public static int firstIndexFinder(int[] a,int d){
		int l=0,h=a.length-1,k=(l+h)/2;
		while(a[h]>=d)
		{
			k=(l+h)/2;
			if(d>a[k])
			{
				l=k+1;
			}
			else if(d<a[k])
			{
				h=k-1;
			}
			else
			{
				h=k-1;
			}
		}
		if(a[h+1]==d)
		{
			return h+1;
		}
		else
		{
			return -1;
		}
	}
}