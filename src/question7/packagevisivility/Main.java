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
