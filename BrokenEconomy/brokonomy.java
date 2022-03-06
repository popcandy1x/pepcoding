import java.util.Scanner;

public class brokonomy{
	public static void main(String[] args){
		Scanner des=new Scanner(System.in);
		int t=des.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=des.nextInt();
			int[] c=new int[n];
			for(int k=0;k<c.length;k++)
			{
				c[k]=des.nextInt();
			}
			int j=des.nextInt();
			int[] b=currencyDenominator(c,j);
			for(int k=0;k<b.length;k++)
			{
				System.out.println(b[k]);
			}
		}
		des.close();
	}
		public static int[] currencyDenominator(int[] a,int k){
			int l=0,h=a.length-1,t=0;
			int[] b;
			while(l<=h)
			{
				t=(l+h)/2;
				if(k>a[t])
				{
					l=t+1;
				}
				else if(k<a[t])
				{
					h=t-1;
				}
				else
				{
					b=new int[1];
					b[0]=a[t];
					return b;
				}
			}
			b=new int[2];
			b[0]=a[l];
			b[1]=a[h];
			return b;
		}
}