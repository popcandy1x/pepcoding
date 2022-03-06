import java.io.*;
import java.util.*;

public class lastindex{
    public static void main(String[] args) throws Exception {
        Scanner xed=new Scanner(System.in);
        int t=xed.nextInt();
        int[] a=new int[t];
        for(int i=0;i<a.length;i++)
        {
            a[i]=xed.nextInt();
        }
        int x=xed.nextInt();
        System.out.println(lastIndex(a,t,x));
        xed.close();
    }

    public static int lastIndex(int[] arr, int idx, int x){
        if(idx==0)
        {
            return arr[0];
        }
        int t=lastIndex(arr,idx-1,x);
        if(t!=-1)
        {
            if(arr[idx-1]==x)
            {
                return idx-1;
            } 
            else
            {
                return t;
            }
        }
        else
        {
            if(arr[idx-1]==x)
            {
                return idx-1;
            } 
            else
            {
                return -1;
            }
        }
    }
}