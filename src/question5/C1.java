package question5;

//Method Specificity

public class C1 {

	public static void main(String[] args) {
		C1 c = new C1();
		char ch = 'a';
		c.m(ch);
		c.m(null);
	}

	private void m(int i) {
		System.out.println("m(int i)");
	}

	private void m(String s) {
		System.out.println("m(String s)");
	}

	private void m(Object o) {
		System.out.println("m(Object o)");
	}

}
