/*
* Variable Types in Java
*   Local variable: This is a variable that is declared inside the body of a method
*   Instance variable: They are object-specific variables, which is why they are known by this name
*   Static variable: This variable is initialized only once, just when the program execution starts using 'STATIC' keyword
* */

/*
* Modifier Types in Java
*   Private
*       Accessible - Same class
*   Protected
*       Accessible - Same class, Same package, Different package but subclass
*   Default
*       Accessible - Same class, Same package
*   Public
*       Accessible - Same class, Same package, Different package
* */

class VariableAndModifierTypes {
    static String staticVariable = "This is a static variable";
    String instanceVariable = "This is an instance variable";

    void functionForLocalVariable(){
        String localVariable = "This is a local variable";
        System.out.println(localVariable);
    }

    private String privateVariable = "This is a private variable";
    protected String protectedVariable = "This is a protected variable";
    String defaultVariable = "This is a default variable";
    public String publicVariable = "This is a public variable";

    /* getter for private variable */
    public String getPrivateVariable(){
        return privateVariable;
    }

    public static void main(String args[]) {
         /* Display of outputs */
        VariableAndModifierTypes variableAndModifierTypes = new VariableAndModifierTypes();

        System.out.println(variableAndModifierTypes.instanceVariable);
        System.out.println(variableAndModifierTypes.staticVariable);
        variableAndModifierTypes.functionForLocalVariable();

        System.out.println(variableAndModifierTypes.getPrivateVariable());
        System.out.println(variableAndModifierTypes.protectedVariable);
        System.out.println(variableAndModifierTypes.defaultVariable);
        System.out.println(variableAndModifierTypes.publicVariable);

    }
}