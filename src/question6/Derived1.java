package question6;

//Base and derived class

class Base1 {
	public int i = 99;

	public void amethod() {
		System.out.println("Base.amethod() i : "+i);
	}
	
	void printI(){
		System.out.println("i : "+i);
	}

	Base1() {
		amethod();
	}
}

public class Derived1 extends Base1 {
	public int i = -1;

	public static void main(String argv[]) {
		Base1 b = new Derived1();
		System.out.println(b.i);
		b.printI();
		b.amethod();
	}

	public void amethod() {
		System.out.println("Derived.amethod() i : "+i);
	}
}