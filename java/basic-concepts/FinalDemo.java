/*
 * Final Keyword
 *   1. Final Variables
 *       Final keyword before variable makes the variable constant. This means once the value assigned to variable cannot be changed further
 *   2. Final Methods
 *       Final method cannot be overridden by any subclasses. Final modifier prevents a method from being modified in a subclass
 *   3. Final Class
 *       Final class declared once then  no class can inherit any feature from the final class
 * */

final class FinalClass{
    /* This class can only be used explicitly and cannot be inherited */
}

class DemoClass {
    final String finalVariable = "This is a constant. Value cannot be changed now";

    final void methodWhichCannotBeOverridden(){
        /* This method cannot be overridden */
    }
}

/* Below code will generate an error as Final class has been extended */
/*
class ExtendFinalClassDemo extends FinalClass {

}
*/

class ExtendDemoClass extends DemoClass {
    /* Below code will generate an error as Final method cannot be overidden */
    /*
    final void methodWhichCannotBeOverridden(){

    }
    */
}

public class FinalDemo {
    public static void main(String args[]) {
        DemoClass object = new DemoClass();

        System.out.println(object.finalVariable);

        /*Trying to modify the final variable below which causes an error 
        
            object.finalVariable = "Hello world";
        */
       
        System.out.println(object.finalVariable);

    }
}