import java.util.*;
import java.io.*;

public class maxofarray{
	public static void main(String[] args){
		Scanner xed=new Scanner(System.in);
		int t=xed.nextInt();
		int[] a=new int[t];
		for(int i=0;i<a.length;i++)
		{
			a[i]=xed.nextInt();
		}
		System.out.println(maxOfArray(a,t));
        xed.close();
	}
	public static int maxOfArray(int[] arr,int idx){
		if(idx==0)
		{
			return arr[idx];
		}
		int max=maxOfArray(arr,idx-1);
		if(arr[idx-1]>max)
		{
			return arr[idx-1];
		}
		return max;
	}
}