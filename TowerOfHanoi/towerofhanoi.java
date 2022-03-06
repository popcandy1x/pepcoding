import java.util.*;
import java.io.*;

public class towerofhanoi{
	public static void main(String[] args){
		Scanner edd=new Scanner(System.in);
		int t=edd.nextInt();
		int n1=edd.nextInt();
		int n2=edd.nextInt();
		int n3=edd.nextInt();
		toh(t,n1,n2,n3);
		edd.close();
	}
	public static void toh(int n,int t1id,int t2id,int t3id){
		if(n==0)
		{
			return;
		}
		toh(n-1,t1id,t3id,t2id);
		System.out.println(n+"["+t1id+"->"+t2id+"]");
		toh(n-1,t3id,t2id,t1id);
	}
}