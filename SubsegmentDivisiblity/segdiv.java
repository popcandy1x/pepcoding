import java.util.Scanner;

public class segdiv{
	public static void main(String[] args){
		Scanner xan=new Scanner(System.in);
		int t=xan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=xan.nextInt();
			int[] a=divSubConstructor(n);
			for(int k=0;k<a.length;k++)
			{
				System.out.print(a[k]+" ");
			}
			System.out.println();
			subArrayDisplayer(a);
		}
		xan.close();
	}
	public static int[] divSubConstructor(int n){
		int[] a=new int[n];
		int k=2,l=1;
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				a[i]=k;
				k+=2;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(i%2!=0)
			{
				a[i]=l;
				l+=2;
			}
		}
		return a;
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