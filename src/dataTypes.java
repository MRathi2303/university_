public class dataTypes {

    public static void main(String[] args) {
        //System.out.println("Data types in Java");

//        byte b = 127;
//        System.out.println("byte data type: " + b);
//
//        short s = 32767;
//        System.out.println("short data type: " + s);
//
//        int in = 2147483647;
//        System.out.println("int data type: " + in);
//
//        long lo = 9223372036854775807L;
//        System.out.println("long data type: " + lo);
//
//        float f = 3.38f;
//        System.out.println("float data type: " + f);
//
//        double d = 1.79769313486238;
//        System.out.println("double data type: " + d);
//
//        boolean bool = true;
//        System.out.println("boolean data type: " + bool);
//
//        char c = 'M';
//        System.out.println("char data type: " + c);



//        int num1 = 0B101;
//        System.out.println(num1);
//
//
//        int num2 = 0x6E;
//        System.out.println( num2);
//
//        double num3 = 12e10;
//        System.out.println(num3);


        //typecasting

        // byte to int
        byte b = 10;
        int i = b; // implicit conversion
        System.out.println("byte to int: " + i);

        // int to short
        int num = 20;
        short s = (short) num; // explicit conversion
        System.out.println("int to short: " + s);

        // short to byte
        short sh = 25;
        byte by = (byte) sh; // explicit conversion
        System.out.println("short to byte: " + by);

        // int to long
        int in = 30;
        long l = in; // implicit conversion
        System.out.println("int to long: " + l);



    }
}