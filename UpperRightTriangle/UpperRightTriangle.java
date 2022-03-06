import java.util.Scanner;

public class UpperRightTriangle{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=s.nextInt();
			getUpperRightTriangle(n);
		}
	}
	public static void getUpperRightTriangle(int n){
		String spc="\t",stp="*";
		for(int i=0;i<n;i++)
		{
			for(int k=0;k<i;k++)
			{
				System.out.print(spc);
			}
			for(int k=0;k<n-i;k++)
			{
				System.out.print(stp+"\t");
			}
			System.out.println();
		}
	}
}
