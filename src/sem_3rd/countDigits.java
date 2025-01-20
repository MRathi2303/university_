package sem_3rd;

import java.util.Scanner;

public class countDigits {

    public static int count(int num){
        if (num == 0) {
            return 1;
        }
        int counter = 0;
        num = Math.abs(num);
        while (num != 0){
            counter++;
            num /= 10;
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter any number: ");
        int num = sc.nextInt();

        System.out.println("Number of digits in the given number are " + count(num));
        sc.close();
         
    }
}