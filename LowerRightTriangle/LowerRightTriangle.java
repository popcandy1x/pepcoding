import java.util.Scanner;

public class LowerRightTriangle{
	public static void main(String[] args){
		Scanner xan=new Scanner(System.in);
		int t=xan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=xan.nextInt();
			getLowerRightTriangle(n);
		}
		xan.close();
	}
	public static void getLowerRightTriangle(int n){
		String sp="\t",stp="*";
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				System.out.print(sp);
			}
			for(int k=1;k<=i+1;k++)
			{
				System.out.print(stp+"\t");
			}
			System.out.println();
		}
	}
}