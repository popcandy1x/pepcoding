import java.util.Scanner;

public class TcsExamination{
	public static void main(String[] args){
		Scanner xed=new Scanner(System.in);
		int t=xed.nextInt();
		for(int i=0;i<t;i++)
		{
			int dsad=xed.nextInt();
			int tocd=xed.nextInt();
			int dmd=xed.nextInt();
			int dsas=xed.nextInt();
			int tocs=xed.nextInt();
			int dms=xed.nextInt();
			int totald=dsad+tocd+dmd;
			int totals=dsas+tocs+dms;
			if(totald>totals)
			{
				System.out.println("Dragon");
			}
			else if(totald<totals)
			{
				System.out.println("Sloth");
			}
			else if(dsad>dsas)
			{
				System.out.println("Dragon");
			}
			else if(dsas>dsad)
			{
				System.out.println("Sloth");
			}
			else if(tocd>tocs)
			{
				System.out.println("Dragon");
			}
			else if(tocd<tocs)
			{
				System.out.println("Sloth");
			}
			else
			{
				System.out.println("tie");
			}
		}
	}
}