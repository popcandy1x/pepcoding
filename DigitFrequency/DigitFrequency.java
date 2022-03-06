import java.util.Scanner;

public class DigitFrequency{
	public static void main(String[] args){
		Scanner x=new Scanner(System.in);
		int t=x.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=x.nextInt();
			int d=x.nextInt();
			System.out.println(getDigitFrequency(n,d));
		}
		x.close();
	}
	public static int getDigitFrequency(int n,int d){
		int a=0,s=0;
		for(int i=n;i!=0;i/=10)
		{
			a=i%10;
			if(a==d)
			{
				s++;
			}
		}
		return s;
	}
}