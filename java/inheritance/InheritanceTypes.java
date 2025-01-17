/*
* Inheritance in java
*   Inheritance can be defined as the process where one class acquires the properties of another
*   extends is the keyword used to inherit the properties of a class
*   Types of inheitance in java
*       Single-level inheritance - Only one class is derived from the parent class
*       Multi-level Inheritance - One class inherits the features from a parent class and the newly created sub-class becomes the base class for another new class
*       Hierarchical Inheritance - Multiple classes are being derived from one superclass
*       Multiple Inheritance - Type of inheritance where a subclass can inherit features from more than one parent class. In java this type of inheritance can only be acheived using interfaces
*       Hybrid Inheritance - A combination of more than two types of inheritances
*   Keywords while using inheritance
*       extends - Creating a subclass of the base class you are extending
*       implements - Using the elements of a Java Interface in your class
*       super
*           super can be used to refer immediate parent class instance variable
*           super can be used to invoke immediate parent class method
*           super() can be used to invoke immediate parent class constructor
* */

/*
* Interfaces in java
*   an abstract type used to specify the behavior of a class
* */


/********************************************** Single Inheritance ****************************************************/

class ParentSingleInheritance {
    
    ParentSingleInheritance() {
        System.out.println("Constructor of ParentSingleInheritance");
    }
}

class ChildSingleInheritance extends ParentSingleInheritance {

    ChildSingleInheritance() {
        super();
        System.out.println("Constructor of ChildSingleInheritance");
    }
}

/******************************************** Multilevel Inheritance **************************************************/

class ParentMultilevelInheritance {

    ParentMultilevelInheritance() {
        System.out.println("Constructor of ParentMultilevelInheritance");
    }

}

class ChildMultilevelInheritance extends ParentMultilevelInheritance {

    ChildMultilevelInheritance() {
        super();
        System.out.println("Constructor of ChildMultilevelInheritance");
    }
}

class GrandChildMultilevelInheritance extends ChildMultilevelInheritance {

    GrandChildMultilevelInheritance() {
        super();
        System.out.println("Constructor of GrandChildMultilevelInheritance");
    }

}

/******************************************* Hierarchical Inheritance *************************************************/

class ParentHierarchicalInheritance {

    ParentHierarchicalInheritance() {
        System.out.println("Constructor of ParentHierarchicalInheritance");
    }

}

class FirstChildHierarchicalInheritance extends ParentHierarchicalInheritance {

    FirstChildHierarchicalInheritance() {
        super();
        System.out.println("Constructor of FirstChildHierarchicalInheritance");
    }

}

class SecondChildHierarchicalInheritance extends ParentHierarchicalInheritance {

    SecondChildHierarchicalInheritance() {
        super();
        System.out.println("Constructor of SecondChildHierarchicalInheritance");
    }

}

class ThirdChildHierarchicalInheritance extends ParentHierarchicalInheritance {

    ThirdChildHierarchicalInheritance() {
        super();
        System.out.println("Constructor of ThirdChildHierarchicalInheritance");
    }

}

/********************************************* Multiple Inheritance ***************************************************/

interface FirstParentMultipleInheritance {

}

interface SecondParentMultipleInheritance {

}

class ChildMultipleInheritance implements FirstParentMultipleInheritance, SecondParentMultipleInheritance {

}

/********************************************* Hybrid Inheritance ***************************************************/

interface GrandParentHybridInheritance {

}

interface FirstParentHybridInheritance extends GrandParentHybridInheritance {

}

interface SecondParentHybridInheritance extends GrandParentHybridInheritance {

}

class ChildHybridInheritance implements FirstParentHybridInheritance, SecondParentHybridInheritance {

}

/*********************************************************************************************************************/

public class InheritanceTypes {

    public static void main(String[] args) {

        ParentSingleInheritance parentSingleInheritance = new ParentSingleInheritance();
        ChildSingleInheritance childSingleInheritance = new ChildSingleInheritance();
        ChildMultilevelInheritance childMultilevelInheritance = new ChildMultilevelInheritance();

    }

}