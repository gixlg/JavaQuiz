package question6;

//Base and derived class

class Base2 {
	public int i = 99;

	public void amethod() {
		System.out.println("Base.amethod() i : "+i);
	}
	
	void printI(){
		System.out.println("i : "+i);
	}

	Base2() {
		amethod();
	}
}

public class Derived2 extends Base2 {
	public int i = -1;

	public static void main(String argv[]) {
		Derived2 d = new Derived2(); //before was Base1 b = new Derived1();
		System.out.println(d.i);
		d.printI();
		d.amethod();
	}

	public void amethod() {
		System.out.println("Derived.amethod() i : "+i);
	}
}