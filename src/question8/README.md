What is the output of this program?

```java
package question8;

class C1 {
	public static String STRING1;
	public static String STRING2 = method();
	public static int i;

	static {
		i++;
		STRING1 = "This" + i;
		System.out.println("This");
	}

	private static String method() {
		i++;
		System.out.println("That");
		return "That" + i;
	}
}

class C2 {
	{
		System.out.println("Blocks");
		str = "Blocks";
	}

	public C2() {
		System.out.println("Costructor");
		str = "Costructor";
	}

	public void printStr() {
		System.out.println("str: " + str);
	}

	private String str = initialize();

	final String initialize() {
		System.out.println("initialize");
		return "initialize";
	}
}

class Main {
	public static void main(String args[]) {
		System.out.printf("c.string1: %s\n", C1.STRING1);
		System.out.printf("c.string2: %s\n", C1.STRING2);

		System.out.println();
		C2 c2 = new C2();
		c2.printStr();

	}
}

```