package question4;

interface MyInterface {
}

public class InstanceImpl implements MyInterface {
	static String str;

	public static void main(String args[]) {
		InstanceImpl instance = new InstanceImpl();
		if (instance instanceof MyInterface) {
			System.out.println("I am true interface");
		} else {
			System.out.println("I am false interface");
		}

		if (str instanceof String) {
			System.out.println("I am true String");
		} else {
			System.out.println("I am false String");
		}
	}
}