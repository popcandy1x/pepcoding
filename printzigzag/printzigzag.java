import java.util.*;
import java.io.*;

public class printzigzag{
	public static void main(String[] args){
		Scanner edd=new Scanner(System.in);
		int t=edd.nextInt();
		pzz(t);
		edd.close();
	}
	public static void pzz(int n){
		if(n==0)
		{
			return;
		}
		System.out.print(n+" ");
		pzz(n-1);
		System.out.print(n+" ");
		pzz(n-1);
		System.out.print(n+" ");
	}
}