package my_Prc;

public class Sample {
	int a;
	static String s;
	

	public Sample(int a, String s) {
		super();
		this.a = a;
		this.s = s;
	}
public static void main(String[] args) {
		Sample e=new Sample(10,"samir");
		System.out.println(e.a);
		System.out.println(s);

	}

}
