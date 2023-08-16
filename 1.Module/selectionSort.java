// public class SelectionSort {
//     public static void main(String args[]) {
//         int[] arr = {5, 2, 12, 9, 15, 4};
//         sorting(arr);
//         for (int i : arr) {
//             System.out.print(i + " ");
//         }
//     }

//     public static void sorting(int[] arr) {
//         for (int i = 0; i < arr.length - 1; i++) {
//             int min = i;
//             for (int j = i + 1; j < arr.length; j++) {
//                 // find min value
//                 if (arr[j] < arr[min]) {
//                     min = j;
//                 }
//             }
//             // swap
//             int temp = arr[min];
//             arr[min] = arr[i];
//             arr[i] = temp;
//         }
//     }
// }
// public class SelectionSort {
//     public static void main(String args[]) {
//         int[] arr = {5, 2, 12, 9, 15, 4};
//         sorting(arr);
//         for (int i : arr) {
//             System.out.print(i + " ");
//         }
//     }

//     public static void sorting(int[] arr) {
//         for (int i = 0; i < arr.length - 1; i++) {
//             int min = i;
//             for (int j = i + 1; j < arr.length; j++) {
//                 // find min value
//                 if (arr[j] < arr[min]) {
//                     min = j;
//                 }
//             }
//             // swap
//             int temp = arr[min];
//             arr[min] = arr[i];
//             arr[i] = temp;
//         }
//     }
// }


public class SelectionSort {
    public static void main(String args[]) {
        int[] arr = {5, 2, 12, 9, 15, 4,91,111,121,500,0,1,3,2};
        sorting(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void sorting(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                // find min value
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            // swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}


