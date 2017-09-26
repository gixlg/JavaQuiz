package question6;

class B {
	private void method1() {
		System.out.println("Parent's method1()");
	}
	
	public void method2() {
		System.out.println("Parent's method2()");
	}

	public void method3() {
		System.out.println("Parent's method3()");
		method1();
		method2();
		System.out.println();
	}
}

class C extends B {
	public void method1() {
		System.out.println("Child's method1()");
	}
	
	public void method2() {
		System.out.println("Child's method2()");
	}
}

public class Derived6 {
	public static void main(String args[]) {
		B c1 = new C();
		c1.method3();
		
		C c2 = new C();
		c2.method3();
	}

}
