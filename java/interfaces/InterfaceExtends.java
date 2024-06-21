/*
*   An interface can extend another interface but can't implement.
*   A class can implement many interfaces but can extend only one class
*   If a class is not implementing all the methods of interface then that class has to be declared as abstract
*/

interface A {
	void method1();
}

interface B {
	void method2();
}

interface C extends A, B {
	void method3();
}

class InterfaceImplementation implements C {
	public void method1() {
		System.out.println("Inside Method1!!");
	}
	public void method2() {
		System.out.println("Inside Method2!!");
	}
	public void method3() {
		System.out.println("Inside Method3!");
	}
	void myMethod() {
		System.out.println("Inside my method!");
	}
}

public class InterfaceExtends {
	public static  void main(String[] args) {
		
        /* commented method calls will throw error because they dont belong to respective interface or class */

        InterfaceImplementation interfaceImpl = new InterfaceImplementation();
		C refC = interfaceImpl;
		refC.method1();
		refC.method2();
		refC.method3();
		//refC.myMethod();

		A refA;
		refA = interfaceImpl;
		refA.method1();
		//refA.method2();
		//refA.method3();
		//refA.myMethod();

		interfaceImpl.method1();
		interfaceImpl.method2();
		interfaceImpl.method3();
		interfaceImpl.myMethod();
	}
}
