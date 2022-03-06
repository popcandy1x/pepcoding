import java.util.Scanner;

public class inverse{
	public static void main(String[] args){
		Scanner xan=new Scanner(System.in);
		int t=xan.nextInt();
		for(int i=0;i<t;i++){
			int n=xan.nextInt();
			int[] a=new int[n];
			for(int k=0;k<a.length;k++)
			{
				a[k]=xan.nextInt();
			}
			a=inverse(a);
			for(int k=0;k<a.length;k++)
			{
				System.out.println(a[k]);
			}
		}
		xan.close();
	}
	public static int[] inverse(int[] a){
		int[] b=new int[a.length];
		int t=0;
		for(int i=0;i<a.length;i++)
		{
			t=a[i];
			b[t]=i;
		}
		return b;
	}
}