package question6;

//Base and derived class

class Base5 {

	protected void protectMethod(){
		System.out.println("Base: protectMethod");
	}
	
	private void privateMethod(){
		System.out.println("Base: privateMethod");
	}
	
	protected void mThatCallProtectMethod(){
		System.out.println("Base: mThatCallProtectMethod");
		protectMethod();
	}	
	
	protected void mThatCallPrivateMethod(){
		System.out.println("Base: mThatCallPrivateMethod");
		privateMethod();
	}

}


public class Derived5 extends Base5 {

	protected void protectMethod(){
		System.out.println("Derivated: protectMethod");
	}
	
	private void privateMethod(){
		System.out.println("Derivated: privateMethod");
	}
	
	public static void main(String[] args) {
		Derived5 d = new Derived5();
		d.mThatCallPrivateMethod();
		d.mThatCallProtectMethod();

	}
	

}
