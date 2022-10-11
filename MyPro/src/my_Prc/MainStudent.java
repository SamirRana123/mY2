package my_Prc;

class Student {
static String branch="BTM";
static void show()
{
	System.out.println("Branch name is"+branch);
}
}
class Qspider extends Student
{
	static  void show()
	{
		System.out.println("Qspider");
		System.out.println("Branch name"+branch);
	}
}
public class MainStudent
{
	public static void main(String[] args)
	{
		Qspider ob=new Qspider();
		ob.show();
	}
}