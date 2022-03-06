import java.util.Scanner;

public class susetaray{
	public static void main(String[] args){
		Scanner edd=new Scanner(System.in);
		int t=edd.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=edd.nextInt();
			int[] a=new int[n];
			for(int k=0;k<a.length;k++)
			{
				a[k]=edd.nextInt();
			}
			subSetDisplayer(a);
		}
	}
	public static void subSetDisplayer(int[] a){
		for(int j=0;j<(int)Math.pow(2,a.length);j++)
		{
			int t=a.length;
			String c=String.format("%0"+t+"d",binaryConverter(j));
			char[] b=c.toCharArray();
			for(int i=0;i<b.length;i++)
			{
				if(b[i]=='1')
				{
					System.out.print(a[i]+"\t");
				}
				else
				{
					System.out.print("-"+"\t");
				}
			}
			System.out.println();
		}
	}
	public static int binaryConverter(int n){
		int a=0,k=1;
		for(int i=n;i!=0;i/=2)
		{
			a+=(i%2)*k;
			k*=10;
		}
		return a;
	}
}