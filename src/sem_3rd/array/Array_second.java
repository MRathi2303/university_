package sem_3rd.array;

import java.util.Scanner;

public class Array_second {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int size = Sc.nextInt();
        float[] arr = new float[size];

        for(int i = 0;i<arr.length;i++){
            arr[i]=Sc.nextFloat();
        }

        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
        int sum = 0;
        //sum of all elements
        for(int i = 0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("sum of all the elements of arrays:" + sum);
        Sc.close();
     }
}
