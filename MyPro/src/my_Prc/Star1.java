package my_Prc;
import java.util.Scanner;

public class Star1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n=s.nextInt();
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=n-i+1;j++)
			{
			System.out.print(" ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.println("* ");
			}
			System.out.println();
		}
		s.close();
	}

}
