This code compile? If no, where is the compilation error (or compilation errors)?
Removing the line where there is the error (or errors) what would be the output?

This code doesn't compile. The errors are on line 13 and 16.
The method packageMethod() from the type MyClassOnOtherPackage is not visible
The method protectMethod() from the type MyClassOnOtherPackage is not visible

Removing that line the output would be:

MyClassOnSamePackage: packageMethod
MyClassThatExtendClassOnOtherPackage: callProtectMethod
MyClassOnOtherPackage: protectMethod
