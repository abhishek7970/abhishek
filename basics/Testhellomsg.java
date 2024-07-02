package in.co.basics;

public class Testhellomsg {
	public static void main(String[] args) {

		if(args.length==3  ) {
			System.out.println("hello"+args[0]+args[1]);
		}else {
			System.out.println("Parameter name is required");
		}
		
	}
}
