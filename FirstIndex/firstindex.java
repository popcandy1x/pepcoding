
import java.io.*;
import java.util.*;

public class firstindex{

    public static void main(String[] args) throws Exception {
        Scanner xed=new Scanner(System.in);
        int t=xed.nextInt();
        int[] a=new int[t];
        for(int i=0;i<a.length;i++)
        {
            a[i]=xed.nextInt();
        }
        int x=xed.nextInt();
        System.out.println(firstIndex(a,t,x));
        xed.close();
    }

    public static int firstIndex(int[] arr, int idx, int x){
        if(idx==0)
        {
            if(arr[0]!=x)
            {
                return -1;
            }
            else
            {
                return 0;
            }
        }
        int t=firstIndex(arr,idx-1,x);
        if(t!=-1)
        {
            return t;
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