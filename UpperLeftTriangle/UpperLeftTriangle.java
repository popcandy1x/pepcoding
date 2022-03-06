import java.util.Scanner;

public class UpperLeftTriangle{
	public static void main(String[] args)
	{
		Scanner xed=new Scanner(System.in);
		int t=xed.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=xed.nextInt();
			getUpperLeftTriangle(n);
		}
	}
	public static void getUpperLeftTriangle(int n)
	{
		String sp="*";
		for(int i=0;i<n;i++)
		{
			for(int k=n-i;k>=1;k--)
			{
				System.out.print(sp+"\t");
			}
			System.out.println();
		}
	}
}