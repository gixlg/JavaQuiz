package question6;

//Base and derived class

class Base4 {
	Base4() {
		System.out.println("Base Constructor");
		method();
	}

	void method() {
	}
}

class Derived4 extends Base4 {
	int var = 2;

	Derived4() {
		System.out.println("Derived Constructor");
	}

	@Override
	void method() {
		System.out.println("var = " + var);
	}

	public static void main(String[] args) {
		new Derived4();
	}
}
