/*
* Types of constructors in java
*   No parameter Constructor - Constructor with no parameters to be passed
*   Parameterized Constructor - Constructor having parameters to be passed
*   Default Constructor - Constructor with no parameters. Created by compiler if no other constructor is created. It is an invisible constructor
* */


class Sample{

	Sample() {
	System.out.println("Constructor with no arguments or known as Default Constructor");
	}
	//parameterised constructor
    
	Sample(int n1,int n2) {
      System.out.println("Constructor with 2 arguments!");
    }  

    Sample(float f) {
     System.out.println("Constructor with 1 float argument!");
    }

    Sample(String s) {
     System.out.println("Constructor with 1 String argument");
    }

    Sample(int n) {
     System.out.println("Constructor with 1 integer argument");
    }
}
public class ConstructorSample{
	public static void main(String[] args){
	  Sample s1 = new Sample("Just a Funny String!");
	  Sample s2 = new Sample(1,2);
	  Sample s3 = new Sample(5);
	  Sample s4 = new Sample();
	  Sample s5 = new Sample((float)3.14);
	  Sample s6 = new Sample(10.56F);
	}
}