package my_Prc;
import java.io.*;

public class ExceptionMy1 {

	public static void main(String[] args) {
		int a[]= {10,45,654,43};
try {
	System.out.println("hi");
	System.out.println(a[3]/0);
	System.out.println("hiii");
	//System.out.println(a[9]);
	
}
catch(ArithmeticException e ) {
	
	System.out.println("hello");
}
catch(ArrayIndexOutOfBoundsException ei)
{
	//System.out.println("ArrayBound");
}
finally {
	System.out.println("finally");
}
	}

}
