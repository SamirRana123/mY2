package my_Prc;

public class VariableShawdow {
	static int a=10;
	int b=25;

	public static void main(String[] args) {
		int a=100;
		System.out.println(VariableShawdow.a);
		VariableShawdow vs=new VariableShawdow();
		vs.print();

	}
void print()
{
	int a=34;
	int b=89;
	System.out.println(this.a);
	System.out.println(this.b);
}
}
