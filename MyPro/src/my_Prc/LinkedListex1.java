package my_Prc;
import java.util.*;;

public class LinkedListex1 {

	public static void main(String[] args) {
		
LinkedList<Object>ll=new LinkedList<Object>();
//LinkedList<Integer>k=new LinkedList<Integer>();
//k.add(100);
//System.out.println(k);
ll.add("Samir");
ll.add(100);
ll.add(56.8);
ll.add(true);
ll.add(2,"rana");
System.out.println(ll.indexOf(100));//1
System.out.println(ll.element());
//System.out.println(ll.);
System.out.println(ll.contains(7));
//Iterator<Object>i=ll.iterator();//iterator
ListIterator<Object>li=ll.listIterator();
while(li.hasNext()==true)
{
	System.out.println(li.next());
}
System.out.println("********");
while(li.hasPrevious()==true)
{
	System.out.println(li.previous());
}
	}

}
