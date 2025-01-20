// create a sem_3rd.array of size 5

package sem_3rd.array;

import java.util.*;

public class Array_first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        sc.close();

        int[] arr = new int[5];

        // input elements in a sem_3rd.array
        for( int i = 0;i<arr.length;i++)
        {
            System.out.print("enter element " + i + "-");
            arr[i]=sc.nextInt();
        }

        //output element of the sem_3rd.array
        for( int i = 0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        // System.out.println(Arrays.toString(arr));

        
    }
}
