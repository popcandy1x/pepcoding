import java.util.Scanner;

public class diffaray{
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
			int s=0;
			for(int i=0;i<c.length;i++)
			{
				if(c[i]!=0)
				{
					s=i;
					break;
				}
			}
			for(int i=s;i<c.length;i++)
			{
				System.out.println(c[i]);
			}
		}
		xan.close();
	}
	public static int[] giveArraySum(int[] a,int[] b)
	{
		int[] c;
		c=new int[b.length];
		for(int i=0;i<b.length-a.length;i++)
		{
			c[i]=b[i];
		}
		for(int i=b.length-1;i>=b.length-a.length;i--)
		{
			if(b[i]<a[i-(b.length-a.length)])
			{
				b[i]+=10;
				b[i-1]--;
			}
			c[i]=b[i]-a[i-(b.length-a.length)];
		}
		c[b.length-a.length-1]=b[b.length-a.length-1];
		for(int i=b.length-a.length-1;i>=0;i--)
		{
			if(c[i]<0)
			{
				if(i!=0)
				{
					c[i]+=10;
					c[i-1]--;
				}
				else
				{
					c[i]+=10;
				}
			}
		}
		return c;
	}
}