import java.util.Scanner;

public class stakanda{
	public static void main(String[] args){
		Scanner edd=new Scanner(System.in);
		int t=edd.nextInt();
		for(int k=0;k<t;k++)
		{
			int n=edd.nextInt();
			int m=edd.nextInt();
			int[][] a=new int[n][m];
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					a[i][j]=edd.nextInt();
				}
			}
			pathProvider(a);
		}
		edd.close();
	}
	public static void pathProvider(int[][] b){
		for(int j=0;j<b[0].length;j++)
		{
			for(int i=0;i<b.length;i++)
			{
				if(j%2==0)
				{
					System.out.println(b[i][j]);
				}
				else
				{
					System.out.println(b[b.length-i-1][j]);
				}
			}
		}
	}
}