What is the output of this program?


```java
package question2;

public class Main {
	static String s1 = "I am unique!";

	public static void main(String args[]) {
		String s2 = "I am unique!";
		String s3 = new String(s1);
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s3 == s1);
		System.out.println(s3.equals(s1));
		System.out.println(TestClass.s4 == s1);

	}
}

class TestClass {
	static String s4 = "I am unique!";
}

```
