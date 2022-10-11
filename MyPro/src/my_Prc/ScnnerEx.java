package my_Prc;
import java.util.Scanner;

public class ScnnerEx {

	public static void main(String[] args) {
		System.out.println("1st execution");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your Age: ");
		s.nextInt();
		System.out.println("Your age is"+s.nextInt());
		s.close();
	}

}
