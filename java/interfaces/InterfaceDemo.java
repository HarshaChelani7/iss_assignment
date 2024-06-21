/*
* Interfaces in java
*   an abstract type used to specify the behavior of a class
*   it is also known as full abstract class
*   they can be used in classes by using 'implement' keyword.
* */

interface A {
	void method1();
	void method2();
}

interface B {
	void method3();
}

class Sample implements A, B {
	public void method1() {
		System.out.println("Inside Method1!");
	}
	public void method2() {
		System.out.println("Inside Method2!");
	}
	public void method3() {
		System.out.println("Inside Method3!");
	}
	void myOwnMethod() {
		System.out.println("Inside my own Method!");
	}
}

class AnotherSample implements B {
	public void method3() {
		System.out.println("Inside method of Another Sample!");
	}
	void myMethod() {
        System.out.println("Inside my method!");
	}
}

public class InterfaceDemo{
	public static void main(String[] args) {
		
        /* commented method calls will throw error because they dont belong to respective interface or class */
        Sample obj = new Sample();

		A refA;
		B refB;
		refA = obj;
		//refA.method3();
		//refA.myOwnMethod();
		refA.method2();
		refA.method1();

         refB = obj;
		refB.method3();
		//refB.myOwnMethod();
		//refB.method2();
		//refB.method1();

		obj.method1();
		obj.method2();
		obj.method3();
		obj.myOwnMethod();

		AnotherSample anotherSample = new AnotherSample();
		//refA = anotherSample;
		refB = anotherSample;

		refB.method3();
		//refB.myMethod();

		anotherSample.method3();
		anotherSample.myMethod();
	}

}