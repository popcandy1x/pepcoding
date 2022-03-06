import java.util.Scanner;

public class stringbuilder{
	public static void main(String[] args){
		Scanner xed=new Scanner(System.in);
		// String s=xed.nextLine();
		// // String x=xed.nextLine();
		// for(int k=0;k<s.length();k++)
		// {
		// 	for(int i=k;i<s.length();i++)
		// 	{
		// 		System.out.println(s.substring(k,i+1));
		// 	}
		// }
		// System.out.println(x);
		// String s1="Hello";
		// // s1+=' ';
		// // s1+='w';
		// // s1+='o';
		// // s1+=10;
		// // String s2="World";
		// // String s3=s1+" "+s2;
		// System.out.println(10+20+s1);
		String s="abc,def,ghi,jkl mno";
		String[] parts=s.split(",");
		for(int i=0;i<parts.length;i++)
		{
			System.out.println(parts[i]);
		}
		xed.close();
	}
}