import java.util.Scanner;

public class FindElement{
	public static void main(String[] args){
		Scanner xan=new Scanner(System.in);
		int t=xan.nextInt();
		for(int j=0;j<t;j++)
		{
			int n=xan.nextInt();
			int[] a=new int[n];
			for(int i=0;i<a.length;i++)
			{
				a[i]=xan.nextInt();
			}
			int d=xan.nextInt();
			System.out.println(elementFinder(a,d));
		}
		xan.close();
	}
	public static int elementFinder(int[] brr,int d){
		for(int i=0;i<brr.length;i++)
		{
			if(brr[i]==d)
			{
				return i;
			}
		}
		return -1;
	}
}