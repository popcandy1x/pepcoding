import java.util.*;
import java.io.*;


public class powerlogarathmic{
	public static void main(String[] args){
		Scanner edd=new Scanner(System.in);
		int t=edd.nextInt();
		int n=edd.nextInt();
		System.out.println(power(t,n));
		edd.close();
	}
	public static int power(int x, int n){
        if(n==0)
        {
            return 1;
        }
       if(n%2==0)
       {
           return power(x,n/2)*power(x,n/2);
       }
       else
       {
           return x*power(x,n/2)*power(x,n/2);
       }
    }
}