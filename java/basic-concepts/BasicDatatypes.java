public class BasicDatatypes {
    public static void main(String args[]) {
        /*
         * Datatypes
         *   1. byte
         *   2. short
         *   3. int
         *   4. long
         *   5. float
         *   6. double
         *   7. boolean
         *   8. char
         * */

        /*
         * byte
         * Range: -128 to 127
         * */
        byte byteData = 100;

        /*
         * short
         * Range: -32768 to 32767
         * */
        short shortData = 10000;

        /*
         * int
         * Range: - 2147483648 to 2147483647
         * */
        int intData = 450000;

        /*
         * long
         * */
        long longData = 10000000L;

        /*
         * float
         * */
        float floatData = 3.14F;

        /*
         * double
         * */
        double doubleData = 76.345;

        /*
         * boolean
         * Range: true or false
         * */
        boolean booleanData = true;

        /*
         * char
         * */
        char charData = 'a';

        /* Display of outputs */
        BasicDatatypes basicDatatypes = new BasicDatatypes();

        System.out.println("Byte Data: " + byteData);
        System.out.println("Short Data: " + shortData);
        System.out.println("Int Data: " + intData);
        System.out.println("Long Data: " + longData);
        System.out.println("Float Data: " + floatData);
        System.out.println("Double Data: " + doubleData);
        System.out.println("Boolean Data: " + booleanData);
        System.out.println("Char Data: " + charData);

    }
}