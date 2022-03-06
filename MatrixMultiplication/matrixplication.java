import java.util.Scanner;

public class matrixplication{
	public static void main(String[] args){
		Scanner edd=new Scanner(System.in);
		int t=edd.nextInt();
		for(int k=0;k<t;k++)
		{
			int n1=edd.nextInt();
			int m1=edd.nextInt();
			int[][] a=new int[n1][m1];
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					a[i][j]=edd.nextInt();
				}
			}
			int n2=edd.nextInt();
			int m2=edd.nextInt();
			int[][] b=new int[n2][m2];
			for(int i=0;i<b.length;i++)
			{
				for(int j=0;j<b[i].length;j++)
				{
					b[i][j]=edd.nextInt();
				}
			}
			if(matrixProductPossiblityChecker(a,b))
			{
				int[][] c=productMatrixConstructor(a,b);
				for(int i=0;i<c.length;i++)
				{
					for(int j=0;j<c[i].length;j++)
					{
						System.out.print(c[i][j]+" ");
					}
					System.out.println();
				}
			}
			else
			{
				System.out.println("Invalid Input");
			}
		}
		edd.close();
	}
	public static boolean matrixProductPossiblityChecker(int[][] a,int[][] b){
		if(a[0].length==b.length)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static int[][] productMatrixConstructor(int[][] a,int[][] b)
	{
		int[][] c=new int[a.length][b[0].length];
		int sum=0;
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				for(int k=0;k<a[0].length;k++)
				{
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		return c;
	}
}