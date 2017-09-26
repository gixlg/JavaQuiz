package question7.packagevisibility.otherpack;

public class MyClassOnOtherPackage {

	protected void protectMethod(){
		System.out.println("MyClassOnOtherPackage: protectMethod");
	}
	
	void packageMethod(){
		System.out.println("MyClassOnSamePackage: packageMethod");
	}

}
