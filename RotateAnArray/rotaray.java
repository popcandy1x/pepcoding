import java.util.Scanner;

public class rotaray{
	public static void main(String[] args){
		Scanner zed=new Scanner(System.in);
		int t=zed.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=zed.nextInt();
			int[] a=new int[n];
			for(int p=0;p<a.length;p++)
			{
				a[p]=zed.nextInt();
			}
			int k=zed.nextInt();
			rotate(a,k);
			display(a);
		}
		zed.close();
	}
	public static void rotate(int[] a,int k)
	{
		int t=0;
		if(k>0)
		{
			for(int i=0;i<k%a.length;i++)
			{
				for(int j=a.length-1;j>0;j--)
				{
					t=a[j];
					a[j]=a[j-1];
					a[j-1]=t;
				}
			}
		}
		else
		{
			for(int i=0;i<Math.abs(k)%a.length;i++)
			{
				for(int j=0;j<a.length-1;j++)
				{
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
	}
	public static void display(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}