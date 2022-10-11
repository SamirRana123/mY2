package my_Prc;

import java.util.*;

public class ListInsEx {

	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<Object>();
		al.add("Samir");
		al.add(29);
		al.add(true);
		al.add("Rana");
		System.out.println(al);
		List<Object> i=new ArrayList<Object>(al);
		Collection<Object> s=new ArrayList<Object>(al);
		System.out.println(i);
System.out.println(s);
	}

}
