import java.util.Scanner;

public class sumaray{
	public static void main(String[] args){
		Scanner xan=new Scanner(System.in);
		int t=xan.nextInt();
		for(int k=0;k<t;k++)
		{
			int x=xan.nextInt();
			int[] a=new int[x];
			for(int i=0;i<a.length;i++)
			{
				a[i]=xan.nextInt();
			}
			int y=xan.nextInt();
			int[] b=new int[y];
			for(int i=0;i<b.length;i++)
			{
				b[i]=xan.nextInt();
			}
			int[] c=giveArraySum(a,b);
			for(int i=0;i<c.length;i++)
			{
				System.out.println(c[i]);
			}
		}
		xan.close();
	}
	public static int[] giveArraySum(int[] a,int[] b)
	{
		int[] c;
		if(a.length>b.length)
		{
			c=new int[a.length];
			for(int i=0;i<a.length-b.length;i++)
			{
				c[i]=a[i];
			}
			for(int i=a.length-b.length;i<a.length;i++)
			{
				c[i]=a[i]+b[i-(a.length-b.length)];
			}
			for(int i=c.length-1;i>0;i--)
			{
				if(c[i]>9)
				{
					c[i]=c[i]%10;
					c[i-1]++;
				}
			}
		}
		else if(b.length>a.length)
		{
			c=new int[b.length];
			for(int i=0;i<b.length-a.length;i++)
			{
				c[i]=b[i];
			}
			for(int i=b.length-a.length;i<b.length;i++)
			{
				c[i]=b[i]+a[i-(b.length-a.length)];
			}
			for(int i=c.length-1;i>0;i--)
			{
				if(c[i]>9)
				{
					c[i]=c[i]%10;
					c[i-1]++;
				}
			}
		}
		else
		{
			c=new int[a.length];
			for(int i=0;i<c.length;i++)
			{
				c[i]=a[i]+b[i];
			}
			for(int i=c.length-1;i>0;i--)
			{
				if(c[i]>9)
				{
					c[i]=c[i]%10;
					c[i-1]++;
				}
			}
		}
		return c;
	}
}