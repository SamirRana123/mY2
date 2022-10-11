package my_Prc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorArrayList {

	public static void main(String[] args) {
		LinkedList<Object>ll=new LinkedList<Object>();
		ll.add("samir");
		ll.add(89);
		ll.add(true);
		ll.add("Linked list");
		ArrayList<Object>al=new ArrayList<Object>();
		al.add("Array List");
		al.add(76);
		al.add(false);
		System.out.println(ll);
		ListIterator<Object> lt=ll.listIterator();
		while(lt.hasNext())
		{
			System.out.println(lt.next());
		}
		while(lt.hasPrevious())
		{
			System.out.println(lt.previous());
		}
		ListIterator<Object> lta=al.listIterator();
		while(lta.hasNext())
		{
			System.out.println(lta.next());
		}
		while(lta.hasPrevious())
		{
			System.out.println(lta.previous());
		}

	}
	}


