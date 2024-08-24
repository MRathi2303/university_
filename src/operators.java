public class operators {
    public static void main(String[] args) {
        int a =10;
        int b=25;
        int c=5;
        boolean y = true;
//        System.out.println("addition:" + (a+b));
//        System.out.println("subtraction:" + (b-a));
//        System.out.println("multiplication:" + (a*b));
//        System.out.println("division:" + (b/a));
//        System.out.println("modulus:" + (b%a));

        // relational operator

//        System.out.println(a<b);
//        System.out.println(a>b);
//        System.out.println(a==b);
//        System.out.println(a!=b);
//        System.out.println(a<=b);
//        System.out.println(a>=b);

        //logical operators
//        System.out.println("AND operator: " + (a < b && a>c));
//        System.out.println("OR operator: " + (a < b || c>a));
//        System.out.println("NOT operator: " + (!y));


        //ternary operator

//        int max = (a > b) ? a : b; // Ternary operation
//        System.out.println("Maximum value: " + max); // 20

        /*
        question - Rewrite the following using ternary operator :
        if(x%2 == 0)
        m = ‘E’;
        else
        m = ‘O’;
        */



        //shift operator

        int num = 5;
        int shiftedNum = num << 1; // shift one bit to the left

        System.out.println("Original number : " + num + "  binary:"+ Integer.toBinaryString(num));
        System.out.println("Number after left shift : " +(num << 1) + "  binary:"+ Integer.toBinaryString(num<<1));
        System.out.println("Number after right shift : " + (num >> 1) + "  binary:"+ Integer.toBinaryString(num>>1));
    }



}
