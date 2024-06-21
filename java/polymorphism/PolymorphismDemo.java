
/*
* Polymorphism in java
*   Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance
*   It can be achieved by method overloading and method overriding
* */


class Calculate {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

class PolymorphismDemo {
    public static void main(String args[]) {
        Calculate calc = new Calculate();

        System.out.println(calc.add(4, 5));
        System.out.println(calc.add(1, 2, 3));

    }
}