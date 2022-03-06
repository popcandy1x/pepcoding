import java.util.Scanner;

public class subaray{
	public static void main(String[] args){
		Scanner edd=new Scanner(System.in);
		int t=edd.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=edd.nextInt();
			int[] a=new int[n];
			for(int j=0;j<a.length;j++)
			{
				a[j]=edd.nextInt();
			}
			subArrayDisplayer(a);
		}
		edd.close();
	}
	public static void subArrayDisplayer(int[] a){
		for(int k=0;k<a.length;k++)
		{
			for(int i=0;i<a.length;i++)
			{
				for(int j=k;j<=i;j++)
				{
					System.out.print(a[j]+" ");
					if(j==i)
					{
						System.out.println();
					}
				}
			}
		}
	}
}