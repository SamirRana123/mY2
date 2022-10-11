package my_Prc;
import java.util.*;

public class ArrayListex1 {

	public static void main(String[] args) {
		ArrayList<Object>l=new ArrayList<Object>();
		ArrayList<Object>li=new ArrayList<Object>();
		l.add("SAmir");
		l.add("rana");
		l.add(78);
		li.add("kolkat");
		li.add("bangalore");
		li.add("83");
		System.out.println(li.add(l.get(1)));
		//System.out.println(l.get(2));
		System.out.println(li);
		//System.out.println(l);
	//li.remove(2);
	//System.out.println(li);
		
	}

}
