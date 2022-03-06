import java.util.Scanner;

public class Becimal{
	public static void main(String[] args){
		Scanner dcn=new Scanner(System.in);
		int t=dcn.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=dcn.nextInt();
			int b=dcn.nextInt();
			System.out.println(getDecimalConverter(n,b));
		}
		dcn.close();
	}
	public static int getDecimalConverter(int n,int b){
		int a=0,k=1,s=0;
		for(int i=n;i!=0;i/=10)
		{
			a=i%10;
			a*=k;
			s+=a;
			k*=b;
		}
		return s;
	}
}