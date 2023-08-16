public class insertionSort{
    public static void main(String[] args) {
        int [] arr = { 2, 4,1,8,6,9,5, 50, 45,39, 22,25};
        sorting(arr);
        for (int i : arr) {
            System.out.print(i+ " ");
        }

        
    }

    static void sorting(int [] arr){

        for (int i = 0; i < arr.length -1; i++) {

            for (int j = 1+i; j > 0; j--) {
                if(arr[j]< arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                }
                
            }
            
        }
    }


}    