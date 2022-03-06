import java.util.Scanner;

public class BaseCalculator{
	public static void main(String[] args){
		Scanner xcn=new Scanner(System.in);
		int t=xcn.nextInt();
		for(int i=0;i<t;i++)
		{
			int b=xcn.nextInt();
			int n1=xcn.nextInt();
			int n2=xcn.nextInt();
			System.out.println(getBaseSum(b,n1,n2));
			System.out.println(getBaseDifference(b,n1,n2));
			System.out.println(getBaseProduct(b,n1,n2));
		}
		xcn.close();
	}
	public static int getBaseSum(int b,int n1,int n2){
		int a=baseToDecimalConverter(b,n1)+baseToDecimalConverter(b,n2);
		return decimalToBaseConverter(b,a);
	}
	public static int getBaseDifference(int b,int n1,int n2){
		int a=baseToDecimalConverter(b,n2)-baseToDecimalConverter(b,n1);
		return decimalToBaseConverter(b,a);
	}
	public static int getBaseProduct(int b,int n1,int n2){
		int a=baseToDecimalConverter(b,n1)*baseToDecimalConverter(b,n2);
		return decimalToBaseConverter(b,a);
	}
	public static int baseToDecimalConverter(int b,int n){
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
	public static int decimalToBaseConverter(int b,int n){
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