import java.util.Scanner;

public class twodaray{
	public static void main(String[] args){
		Scanner fred=new Scanner(System.in);
		int t=fred.nextInt();
		for(int k=0;k<t;k++)
		{
			int n=fred.nextInt();
			int m=fred.nextInt();
			int[][] a=new int[n][m];
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					a[i][j]=fred.nextInt();
				}
			}
			twoDArrayDisplayer(a);
		}
		fred.close();
	}
	public static void twoDArrayDisplayer(int[][] a){
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}