This code compile? If no, where is the compilation error (or compilation errors)?
Removing the line where there is the error (or errors) what would be the output?

```java
package question7.packagevisivility;

import question7.packagevisibility.otherpack.MyClassOnOtherPackage;

public class Main {

	public static void main(String[] args) {

		MyClassOnSamePackage clsOnSamePackage = new MyClassOnSamePackage();
		clsOnSamePackage.packageMethod();

		MyClassOnOtherPackage clsOnOtherPackage = new MyClassOnOtherPackage();
		clsOnOtherPackage.packageMethod(); 
											
		MyClassThatExtendClassOnOtherPackage clsThatExtendClassOnOtherPackage = new MyClassThatExtendClassOnOtherPackage();
		clsThatExtendClassOnOtherPackage.protectMethod();
		clsThatExtendClassOnOtherPackage.callProtectMethod();
	}
}

```


```java
package question7.packagevisivility;

public class MyClassOnSamePackage {

	void packageMethod(){
		System.out.println("MyClassOnSamePackage: packageMethod");
	}

}

```


```java
package question7.packagevisibility.otherpack;

public class MyClassOnOtherPackage {

	protected void protectMethod(){
		System.out.println("MyClassOnOtherPackage: protectMethod");
	}
	
	void packageMethod(){
		System.out.println("MyClassOnSamePackage: packageMethod");
	}

}


```


```java
package question7.packagevisivility;

import question7.packagevisibility.otherpack.MyClassOnOtherPackage;

public class MyClassThatExtendClassOnOtherPackage extends MyClassOnOtherPackage{
	
	public void callProtectMethod(){
		System.out.println("MyClassThatExtendClassOnOtherPackage: callProtectMethod");
		this.protectMethod();
	}

}


```