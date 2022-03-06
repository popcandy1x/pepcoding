import java.util.Scanner;

public class LowerLeftTriangle{
	public static void main(String[] args){
		Scanner xcn=new Scanner(System.in);
		int t=xcn.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=xcn.nextInt();
			getlowerLeftTriangle(n);
		}
		xcn.close();
	}
	public static void getlowerLeftTriangle(int n)
	{
		String star="*";
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(star+" ");
			}
			System.out.println();
		}
	}
}