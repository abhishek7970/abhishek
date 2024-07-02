package in.co.basics;

public class Testtable {
	public static void main (String[]args) {
		for (int i=1; i<=10;i++) {
			for (int j=2; j<=10; j++) {
				System.out.println(j+"x"+i+"="+(j*i)+"\t");
			}
			System.out.println();
		}
	}
}


