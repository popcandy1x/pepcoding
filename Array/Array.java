public class Array{
	public static void main(String[] args){
		int[] a=new int[5];
		a[0]=33;
		a[1]=47;
		a[2]=59;
		a[3]=67;
		a[4]=98;
		// System.out.println(a.length);
		// int[] two=a;
		// two[2]=590;
		// for(int i=0;i<a.length;i++)
		// {
		// 	System.out.println(a[i]);
		// }
		// for(int i=0;i<two.length;i++)
		// {
		// 	System.out.println(two[i]);
		// }
		swap(a,0,4);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static void swap(int[] a,int i,int j){
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
}