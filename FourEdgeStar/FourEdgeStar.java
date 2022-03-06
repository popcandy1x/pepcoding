import java.util.Scanner;

public class FourEdgeStar
{
	public static void main(String[] args){
		Scanner foredge=new Scanner(System.in);
		int t=foredge.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=foredge.nextInt();
			getFourEdgeStar(n);
		}
		foredge.close();
	}
	public static void getFourEdgeStar(int n){
		String spc="\t",fes="*";
		for(int i=0;i<n/2;i++)
		{
			for(int k=0;k<n/2-i;k++)
			{
				System.out.print(spc);
			}
			for(int k=1;k<=2*i+1;k++)
			{
				System.out.print(fes+"\t");
			}
			for(int k=0;k<n/2-i;k++)
			{
				System.out.print(spc);
			}
			System.out.print("\n");
		}
		for(int i=0;i<n;i++)
		{
		System.out.print(fes+"\t");
		}
		System.out.print("\n");
		for(int i=n/2+1;i<n;i++)
		{
			for(int k=0;k<i-n/2;k++)
			{
				System.out.print(spc);
			}
			for(int k=1;k<=2*n-(2*i+1);k++)
			{
				System.out.print(fes+"\t");
			}
			for(int k=0;k<i-n/2;k++)
			{
				System.out.print(spc);
			}
			System.out.print("\n");
		}
	}
}