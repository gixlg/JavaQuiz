package question7.packagevisivility;

import question7.packagevisibility.otherpack.MyClassOnOtherPackage;

public class MyClassThatExtendClassOnOtherPackage extends MyClassOnOtherPackage{
	
	public void callProtectMethod(){
		System.out.println("MyClassThatExtendClassOnOtherPackage: callProtectMethod");
		this.protectMethod();
	}

}
