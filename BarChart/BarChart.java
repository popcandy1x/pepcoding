import java.util.Scanner;

public class BarChart{
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
			printBarChart(a);
		}
		xed.close();
	}
	public static void printBarChart(int[] brr){
		String star="*";
		int max=maxElementFinder(brr);
		// for(int j=0;j<brr.length;j++)
		// {
		// 	for(int i=max-1;i>=max-brr[j];i--)
		// 	{
		// 		arr[i][j]=star;
		// 	}
		// }
		// for(int j=0;j<brr.length;j++)
		// {
		// 	int i=max-1;
		// 	for(int k=0;k<brr[j];k++)
		// 	{
		// 		arr[i][j]=star;
		// 		i--;
		// 	}
		// }
		// for(int i=0;i<max;i++)
		// {
		// 	for(int j=0;j<brr.length;j++)
		// 	{
		// 		if(arr[i][j]!=star)
		// 		{
		// 			arr[i][j]="";
		// 		}
		// 	}
		// }
		// for(int i=0;i<max;i++)
		// {
		// 	for(int j=0;j<brr.length;j++)
		// 	{
		// 		System.out.print(arr[i][j]+"\t");
		// 	}
		// 	System.out.print("\n");
		// }
		for(int i=max;i>0;i--)
		{
			for(int j=0;j<brr.length;j++)
			{
			if(brr[j]>=i)
			{
				System.out.print(star+"\t");
			}
			else
			{
				System.out.print("\t");
			}
			}
			System.out.print("\n");	
		}
	}
	public static int maxElementFinder(int[] brr){
		int max=brr[0];
		for(int i=0;i<brr.length;i++)
		{
			if(brr[i]>max)
			{
				max=brr[i];
			}
		}
		return max;
	}
}