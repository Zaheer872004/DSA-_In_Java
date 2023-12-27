import java.util.Scanner;

public class armstrongNo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // System.out.print("Enter the three digits no. : ");
        // int num = input.nextInt();

        // System.out.println(isArmstrong(num));        
        for (int i = 100; i <1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }

        // if (ans == num) {
        //     System.out.println("Yes it is armstrong Number");
        // }
        // else{
        //     System.out.println("No it is not  armstrong Number");
        // }
    }

    static int armstrong(int n){
        int sum=0,rem;

        while( n > 0){
            rem = n % 10;

            sum = sum + (rem*rem*rem);
            n = n/10;
        }
        return sum;
    }

    static boolean isArmstrong(int n){


        int sum=0;
        int original = n;

        while (n!=0) {

            int rem = n%10;

            sum += (rem*rem*rem);

            n /=10;
            
        }

        return sum == original;

    }
}
