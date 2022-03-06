import java.util.Scanner;

public class revaray{
	public static void main(String[] args){
		Scanner xed=new Scanner(System.in);
		int t=xed.nextInt();
		for(int j=0;j<t;j++)
		{
			int n=xed.nextInt();
			int[] a=new int[n];
			for(int i=0;i<a.length;i++)
			{
				a[i]=xed.nextInt();
			}
			a=arrayReverser(a);
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
		}
		xed.close();
	}
	public static int[] arrayReverser(int[] a)
	{
		int t=0;
		int n=a.length;
		for(int i=0;i<a.length;i++)
		{
			if(n%2==0)
			{
				t=a[i];
				a[i]=a[n-i-1];
				a[n-i-1]=t;
				if(i==n/2-1)
				{
					break;
				}
			}
			else
			{
				t=a[i];
				a[i]=a[n-i-1];
				a[n-i-1]=t;
				if(i==n/2-1)
				{
					break;
				}
			}
		}
		return a;
	}
}