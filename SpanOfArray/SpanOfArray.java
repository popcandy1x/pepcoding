import java.util.Scanner;

public class SpanOfArray{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		for(int j=0;j<t;j++)
		{
			int n=scn.nextInt();
			int[] a=new int[n];
			for(int i=0;i<a.length;i++)
			{
				a[i]=scn.nextInt();
			}
			System.out.println(giveSpanOfArray(a));
		}
		scn.close();
	}
	public static int giveSpanOfArray(int[] a){
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		return max-min;
	}
}