/*
* Encapsulation in java
*   Process of wrapping code and data together into a single unit
* */

class Student {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

class EncapsulationDemo {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.setName("John");
        Student s2 = new Student();
        s2. setName("Jimmy");

        System.out.println("Students List: ");
        System.out.println(s1.getName());
        System.out.println(s2.getName());

    }
}