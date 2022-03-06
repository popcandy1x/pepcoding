import java.util.*;
import java.io.*;

public class powerlinear{
	public static void main(String[] args){
		Scanner edd=new Scanner(System.in);
		int x=edd.nextInt();
		int n=edd.nextInt();
		power(x,n)
		edd.close();
	}
	public static int power(int x,int n){
		if(n==0)
		{
			return 1;
		}
		return x*power(x,n-1);
	}
}