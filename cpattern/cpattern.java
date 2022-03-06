import java.util.Scanner;

public class cpattern{
	public static void main(String[] args){
		Scanner cpat=new Scanner(System.in);
		int n=cpat.nextInt();
		int[][] a=new int[2*n-1][2*n-1];
		for(int i=0;i<a.length;i++)
		{
			int t=n;
			for(int j=0;j<a[i].length;j++)
			{
				if(i!=0||i!=a.length-1)
				{
					if(i<=a.length/2)
					{
						if(j<i)
						{
							a[i][j]=n;
							a[a.length-i-1][j]=n;
							n--;
						}
						else if(j>=a[i].length-i)
						{
							n++;
							a[i][j]=n;
							a[a.length-i-1][j]=n;
						}
						else
						{
							a[i][j]=n;
							a[a.length-i-1][j]=n;
						}
					}
				}
				else
				{
					a[i][j]=t;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		cpat.close();
	}
}