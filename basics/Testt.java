package in.co.basics;

public class Testt {
public static void saysomethings() {
	System.out.println("hello world");
}

public static void sum() {
	int a=20;
	int b=40;
	System.out.println("sum:="+(a+b));
}

public  static int sub(int a, int b) {
	return a+b;
}
public static void main(String[]args) {
	Testt t=new Testt();
	t.saysomethings();
	System.out.println(t.sub(30,50));
	t.sum();
}
}
