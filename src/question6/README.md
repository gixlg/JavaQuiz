What are the outputs of these programs?

```java
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
```


```java
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
```


```java
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
```


```java
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

```


```java
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

```


```java
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

```
