import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.*;

class first {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.println("hello world");

        // int[] ros; // here declaration or define
        // System.out.print(ros[0]);
        // ros = new int[5]; // here is intialisation

        // and also
        // int[] arr = {1,2,3,4,54,5,6,7};

        // what happend on object array
        // String[] arr1 = new String[5];

        // int[] arr = new int[5];

        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = input.nextInt();
        // }

        // System.out.println(Arrays.toString(arr)); // no need to use loop it
        // internally used loops

        // for (int i = 0; i < arr.length; i++) {
        // // arr[i] = input.nextInt();
        // System.out.print(arr[i] + " ");
        // }

        // String[] name = {"Zaheer","habib", "khan"};
        // String[] str = new String[5];

        // for (int i = 0; i < str.length; i++) {
        // System.out.print("enter the string : ");
        // str[i] = input.nextLine();
        // }

        // System.out.println(Arrays.toString(str));

        // int[] arr = { 5, 10, 15, 20, 25 };
        // System.out.println(Arrays.toString(arr));

        // change(arr);
        // System.out.println(Arrays.toString(arr));

        int[][] arr = new int[3][3];

        // Taking input on 2D arrays
        for (int row = 0; row < arr.length; row++) {
            // for colums
            // System.out.print("Enter the input for col : ");
            for (int col = 0; col < arr[row].length; col++) {
                // taking input
                arr[row][col] = input.nextInt();
            }
            System.out.println();
        }

        // Output on 2D arrays
        // for (int row = 0; row < arr.length; row++) {
        // // inside cols
        // for (int col = 0; col < arr[row].length; col++) {
        // System.out.print(arr[row][col] + " ");
        // }
        // System.out.println();
        // }

        // for (int row = 0; row < arr.length; row++) {
        // System.out.println(Arrays.toString(arr[row]));
        // }

        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }

    // static void change(int[] nums) {
    // nums[0] = 99;
    // }
}