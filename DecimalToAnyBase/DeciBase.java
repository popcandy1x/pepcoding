import java.util.Scanner;

public class DeciBase{
	public static void main(String[] args){
		Scanner asd=new Scanner(System.in);
		int t=asd.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=asd.nextInt();
			int b=asd.nextInt();
			System.out.println(baseConverter(n,b));
		}
		asd.close();
	}
	public static int  baseConverter(int n,int b){
		int a=0,k=1,s=0;
		for(int i=n;i!=0;i/=b)
		{
			a=i%b;
			a*=k;
			s+=a;
			k*=10;
		}
		return s;
	}
}