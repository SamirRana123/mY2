package my_Prc;

public class StaticBlock {

	public static void main(String[] args) {
		System.out.println(Hello.a);
		//Hello h=new Hello();

	}

}
class Hello
{
final static int a=10;
static
{
	System.out.println("St block");
}
}