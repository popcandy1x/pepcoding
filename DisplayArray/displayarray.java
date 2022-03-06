import java.util.*;
import java.io.*;

public class displayarray{
	public static void main(String[] args){
		Scanner xed=new Scanner(System.in);
		int t=xed.nextInt();
		int[] a=new int[t];
		for(int i=0;i<a.length;i++)
		{
			a[i]=xed.nextInt();
		}
		displayArr(a,t);
		xed.close();
	}
	public static void displayArr(int[] arr,int idx){
		if(idx==0)
		{
			return;
		}
		displayArr(arr,idx-1);
		System.out.println(arr[idx-1]);
	}
}