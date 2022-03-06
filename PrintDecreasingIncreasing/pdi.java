import java.io.*;
import java.util.*;

public class pdi{

    public static void main(String[] args) throws Exception {
        Scanner xed=new Scanner(System.in);
        int t=xed.nextInt();
        pdi(t);
    }

    public static void pdi(int n){
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        pdi(n-1);
        System.out.println(n);
    }

}