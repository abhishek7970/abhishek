package in.co.basics;

public class TestREversename {
	public static void main(String[] args) {
		String name = "abhishek yadav";
		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.print(name.charAt(i));
		}
	}
}
