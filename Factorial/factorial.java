import java.util.*;
import java.io.*;


public class factorial{
	public static void main(String[] args)throws Exception{
		Scanner edd=new Scanner(System.in);
		int t=edd.nextInt();
		factorial(t);
	}
	public static int factorial(int n){
		if(n==0)
		{
			return;
		}
		return n*factorial(n-1);
	}
}