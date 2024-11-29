package iilm.java.practicals;

import java.util.Scanner;
public class disariumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number :");
        int num = sc.nextInt();

        //converting int to string
        String numStr=String.valueOf(num);

        //storing the length og the string in length variable
        int length = numStr.length();

        int result=0;

        int temp=num;

        while(temp!=0){
            int digit = temp %10;
            result+= Math.pow(digit,length);
            length--;
            temp /=10;
        }
        if (result==num){
            System.out.println("it is a disarium number");

        }else {
            System.out.println("not a disarium number");
        }
        sc.close();

        }
        }


