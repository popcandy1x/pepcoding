import java.util.*;
import java.io.*;

public class reversearraydisplay{
	public static void main(String[] args){
		Scanner xed=new Scanner(System.in);
		int t=xed.nextInt();
		int[] a=new int[t];
		for(int i=0;i<a.length;i++)
		{
			a[i]=xed.nextInt();
		}
		displayArrReverse(a,t);
		xed.close();
	}
	public static void displayArrReverse(int[] arr,int idx){
		if(idx==0)
		{
			return;
		}
		System.out.println(arr[idx-1]);
		displayArrReverse(arr,idx-1);
	}	
}