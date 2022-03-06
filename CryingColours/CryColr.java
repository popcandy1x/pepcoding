import java.util.Scanner;

public class CryColr{
	public static void main(String[] args){
		Scanner edd=new Scanner(System.in);
		int t=edd.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=edd.nextInt();
			int a[]=new int[3];
			int b[]=new int[3];
			int c[]=new int[3];
			for(int k=0;k<a.length;k++)
			{
				a[k]=edd.nextInt();
			}
			for(int k=0;k<b.length;k++)
			{
				b[k]=edd.nextInt();
			}
			for(int k=0;k<c.length;k++)
			{
				c[k]=edd.nextInt();
			}
			System.out.println(swap(a,b,c));
		}
	}
	public static int swap(int[] a,int[] b,int[] c){
		int s=0;
		if(checkAllZeroCase(a,b,c))
		{
			return 0;
		}
		else
		{
			int a1[]=new int[3];
			int b1[]=new int[3];
			int c1[]=new int[3];
			a1[0]=a[0];
			a1[1]=b[0];
			a1[2]=c[0];
			b1[0]=a[1];
			b1[1]=b[1];
			b1[2]=c[1];
			c1[0]=a[2];
			c1[1]=b[2];
			c1[2]=c[2];
			for(int i=1;i<3;i++)
			{
				if(a1[i]-a[i]!=0)
				{
					s+=Math.abs(a1[i]-a[i]);
				}
				else
				{
					s+=a1[i];
				}
			}
			for(int i=0;i<3;i++)
			{
				if(i!=1)
				{
					if(b1[i]-b[i]!=0)
					{
						s+=Math.abs(b1[i]-b[i]);
					}
					else
					{
						if(b1[2]-b[2]==0)
						{
							s+=b1[2];
						}
					}
				}
			}
			for(int i=0;i<3;i++)
			{
				if(i!=2)
				{
					if(c1[i]-c[i]!=0)
					{
						s+=Math.abs(c1[i]-c[i]);
					}
				}
			}
			return s;
		}
	}
	public static boolean checkAllZeroCase(int[] a,int[] b,int[] c)
	{
		if(a[1]!=0||a[2]!=0||b[0]!=0||b[2]!=0||c[0]!=0||c[1]!=0)
		{
			return false;
		}
		return true;
	}
}