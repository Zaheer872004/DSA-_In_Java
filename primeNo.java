import java.util.Scanner;

public class primeNo{
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the value for checking prime or not :");
        int num = input.nextInt();
        
        boolean ans = isPrime(num);
        System.out.println(num+" is "+ans);

        input.close();
        
    }

    static boolean isPrime (int n) {
        
        if(n <= 1){
            return false;
        }

        int c = 2;
        while (c * c <=n ) {
            if(n%c == 0){
                return false;
            }
            c++;    
        }

        return c*c>n;

        // if( c *c > n){
        //     return true;
        // }

        // return false;
    }
}