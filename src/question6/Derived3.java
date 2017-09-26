package question6;

//Base and derived class

class Base3 {
	public int i = 99;

	private void amethod() {  //before was public void amethod()
		System.out.println("Base.amethod() i : "+i);
	}
	
	void printI(){
		System.out.println("i : "+i);
	}

	Base3() {
		amethod();
	}
}

public class Derived3 extends Base3 {
	public int i = -1;

	public static void main(String argv[]) {
		Derived3 d = new Derived3();
		System.out.println(d.i);
		d.printI();
		d.amethod();
	}

	public void amethod() {
		System.out.println("Derived.amethod() i : "+i);
	}
}