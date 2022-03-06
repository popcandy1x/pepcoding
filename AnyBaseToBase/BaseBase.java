import java.util.Scanner;

public class BaseBase{
	public static void main(String[] args){
		Scanner xcn=new Scanner(System.in);
		int t=xcn.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=xcn.nextInt();
			int b1=xcn.nextInt();
			int b2=xcn.nextInt();
			System.out.println(AnyBaseDoor(n,b1,b2));
		}
	}
	public static int AnyBaseDoor(int n,int b1,int b2){
		int a=0,k=1,sd=0,s=0;
		for(int i=n;i!=0;i/=10)
		{
			a=i%10;
			a*=k;
			sd+=a;
			k*=b1;
		}
		k=1;
		for(int i=sd;i!=0;i/=b2)
		{
			a=i%b2;
			a*=k;
			s+=a;
			k*=10;
		}
		return s;
	}
}