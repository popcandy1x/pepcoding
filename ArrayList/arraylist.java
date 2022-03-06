import java.util.*;
import java.io.*;

public class arraylist{
	public static void main(String[] args){
		ArrayList<Integer> list=new ArrayList<>();
		System.out.println(list+"->"+list.size());
		//add
		list.add(10);
		System.out.println(list+"->"+list.size());
		list.add(20);
		System.out.println(list+"->"+list.size());
		list.add(30);
		System.out.println(list+"->"+list.size());
		list.add(1,1000);
		System.out.println(list+"->"+list.size());

		int val=list.get(1);//not list[1]
		System.out.println(val);

		list.set(1,2000);//not list[1]=2000;
		System.out.println(list+"->"+list.size());

		list.remove(1);
		System.out.println(list+"->"+list.size());
		ArrayList<String> l=new ArrayList<>();
		l.add("Hello");
		l.add("Bello");
		l.add("Cello");
		System.out.println(l+"->"+l.size());
		// for(int i=0;i<l.size();i++)
		// {
		// 	System.out.println(l.get(i));
		// }
		// for(String i:l)
		// {
		// 	System.out.println(i);
		// }
		System.out.println(list);
	}
}
