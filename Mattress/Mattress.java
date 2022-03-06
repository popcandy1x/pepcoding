import java.util.Scanner;

public class Mattress{
	public static void main(String[] args){
		Scanner ac=new Scanner(System.in);
		int t=ac.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=ac.nextInt();
			getMattress(n);
		}
		ac.close();
	}
	public static void getMattress(int n){
		String spc="\t",mat="*";
		for(int i=0;i<n/2-1;i++)
		{
			for(int k=0;k<n-2*(i+1);k++)
			{
				if(k!=(n-2*(i+1))-1)
				{
					System.out.print(mat+"\t");
				}
				else
				{
					System.out.print(mat);
				}
			}
			for(int k=0;k<4*(i+1)-2;k++)
			{
				System.out.print(spc);
			}
			for(int k=0;k<n-2*(i+1);k++)
			{
				System.out.print(mat+"\t");
			}
			System.out.print("\n");
		}
		for(int i=0;i<1;i++)
		{
			for(int k=0;k<2;k++)
			{
				if(k!=1)
				{
					System.out.print(mat+"\t");
				}
				else
				{
					System.out.print(mat);
				}
			}
			for(int k=0;k<2*(n-1)-4;k++)
			{
				System.out.print(spc);
			}
			for(int k=0;k<2;k++)
			{
				System.out.print(mat+"\t");
			}
			System.out.print("\n");
		}
		for(int i=0;i<1;i++)
		{
			System.out.print(mat);
			for(int k=0;k<2*(n-1)-2;k++)
			{
				System.out.print(spc);
			}
			System.out.print(mat+"\t");
			System.out.print("\n");
		}
		for(int i=0;i<1;i++)
		{
			for(int k=0;k<2;k++)
			{
				if(k!=1)
				{
					System.out.print(mat+"\t");
				}
				else
				{
					System.out.print(mat);
				}
			}
			for(int k=0;k<2*(n-1)-4;k++)
			{
				System.out.print(spc);
			}
			for(int k=0;k<2;k++)
			{
				System.out.print(mat+"\t");
			}
			System.out.print("\n");
		}
		for(int i=n/2+2;i<n;i++)
		{
			for(int k=0;k<2*i-n;k++)
			{
				if(k!=(2*i-n)-1)
				{
					System.out.print(mat+"\t");
				}
				else
				{
					System.out.print(mat);
				}
			}
			for(int k=0;k<4*n-2-4*(i);k++)
			{
				System.out.print(spc);
			}
			for(int k=0;k<2*i-n;k++)
			{
				System.out.print(mat+"\t");
			}
			System.out.print("\n");
		}
	}
}