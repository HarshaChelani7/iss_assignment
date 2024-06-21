
/*
* Abstraction in java
*   The process of hiding certain details and showing only essential information to the user
*   Abstraction can be achieved with either abstract classes or interfaces
*   Abstract Keyword
*       Abstract class - Is a restricted class that cannot be used to create objects
*       Abstract method - Can only be used in an abstract class, and it does not have a body. The body is provided by the subclass
 * */

/*
* Overriding in java
*    It is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes
* */


abstract class Shape {
	int side1, side2;
	Shape(int side) {
		setSide(side);
	}

	Shape(int side1,int side2) {
		setSides(side1, side2);
	}

	void setSides(int side1, int side2){
		this.side1 = side1;
		this.side2 = side2;
	}

	void setSide(int side) {
		this.side1 = this.side2 = side;
	}

	void displaySides() {
		System.out.println("Side1 = "+ this.side1);
    	System.out.println("Side2 = "+ this.side2);			
	}

	//abstract methods
	abstract void area();
	abstract void perimeter();
     
}
class Rectangle extends Shape {
	Rectangle(int side1, int side2) {
        super(side1,side2);
    }

	//overriding abstract methods 
    void area() {
        System.out.println("Area of rectangle = " + (side1 * side2));
    }

    void perimeter() {
        System.out.println("Perimeter of rectangle = " + (2 * (side1 + side2)));
    }
}

class Triangle extends Shape {
	Triangle(int side1, int side2) {
		super(side1,side2);
	}

	//overriding abstract methods 
	void area() {
		System.out.println("Area of triangle = " + (0.5 * (side1 * side2)));
	}

	void perimeter(){
		System.out.println("Perimeter of triangle = " + (side1 * side2));
	}
}

class Square extends Shape {
	Square(int side) {
		super(side);
	}

	//overriding abstract methods 
	void area() {
		System.out.println("Area of square = " + (side1 * side1));
	}
	void perimeter() {
		System.out.println("Perimeter of square = " + (4 * side1));
	}
}
class AbstractDemo {
	public static void main(String[] args){
		//Object of abstract class
        Shape s;
		Rectangle r = new Rectangle(10,20);

		//referred abstract class object to child classes
        s = r;
		s.area();
		s.perimeter();

		s = new Triangle(10,20);
		s.area();
		s.perimeter();

		s = new Square(10);
		s.area();
		s.perimeter();
	}
}
