package sem_3rd.ClassAndObjects;

public class Calculator {
    private int num1;
    private int num2;
    static int num3 = 5;

    public Calculator(int a, int b) {
        this.num1 = a;
        this.num2 = b;
    }
    public static void add(int a, int b)
     { // example of static method 
        a=10;
        b=20;
        System.out.println(a+b);
    }

    public void calculate(char c) {
        if (c == '+') {
            System.out.println(this.num1 + this.num2);
        } else if (c == '-') {
            System.out.println(this.num1 - this.num2);
        } else if (c == '*') {
            System.out.println(this.num1 * this.num2);
        } else if (c == '/') {
            if (this.num2 != 0) {
                System.out.println(this.num1 / this.num2);
            } else {
                System.out.println("Error");
            }
        } else {
            System.out.println("Invalid");
        }
    }

    public static void main(String[] args) {
        // Calculator calc = new Calculator(10, 5);
        // calc.calculate('+');  
        // calc.calculate('-');  
        // calc.calculate('*');  
        // calc.calculate('/');  

        add(num3, num3);
    }
}

        
    

