package question5;

//Method Specificity

class B {
	private int b;
	
	public B(int b){
		this.b=b;
	}
}

public class C2 {

	public static void main(String[] args) {
		C2 c = new C2();
		char ch = 'a';
		c.m(ch);
		c.m(null);
		c.m(new B(0));
	}
	
	private void m(int i){
		System.out.println("m(int i)");
	}
	
	private void m(String s){
		System.out.println("m(String s)");
	}
	
	private void m(B s){
		System.out.println("m(B s)");
	}
	
	private void m(Object o){
		System.out.println("m(Object o)");
	}

}
