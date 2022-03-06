import java.util.Scanner;

public class invbarc{
	public static void main(String[] args){
		Scanner fred=new Scanner(System.in);
		int t=fred.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=fred.nextInt();
			int[] a=new int[n];
			for(int j=0;j<a.length;j++)
			{
				a[j]=fred.nextInt();
			}
			invertedBarChartDisplayer(a);
		}
		fred.close();
	}
	public static void invertedBarChartDisplayer(int[] a){
		int k=maxElementSearcher(a);
		for(int i=0;i<k;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[j]!=0)
				{
					if(a[j]>i)
					{
						System.out.print("*"+"\t");
					}
					else
					{
						System.out.print("\t");
					}
				}
				else
				{
					System.out.print("\t");
				}
			}
			System.out.println();	
		}
	}
	public static int maxElementSearcher(int[] a){
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		return max;
	}
}