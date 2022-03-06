import java.util.Scanner;

public class stringcompression{
	public static void main(String[] args){
		Scanner xed=new Scanner(System.in);
		String s=xed.nextLine();
		char[] chars=s.toCharArray();
		System.out.println(compress(chars));
		// for(int i=0;i<chars.length;i++)
		// {
		// 	System.out.println(chars[i]);
		// }
		xed.close();
	}
	public static String compress(char[] chars){
        String d=new String("");
		int b=0;
		for(int i=0;i<chars.length;i+=b)
		{
			char c=chars[i];
			int k=0;
			for(int j=i;j<chars.length;j++)
			{
				if(chars[j]==c)
				{
					k++;
					b=k;
				}
				else
				break;
			}
			d+=c;
			if(k!=1)
			{
				d+=k;
			}
		}
        return d;
    }
}