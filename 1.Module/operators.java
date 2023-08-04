import java.util.*;
public class operators{
    public static void main(String[] args){
        // System.out.println("hello world");
        Scanner input  = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name_1 = input.nextLine();

        System.out.println("Your name is : "+name_1);

        int a = 20;
        int b = 7;
        a+=b;

        double c = a/b;
         double result = (double) a/b;

        // System.out.println("sums is : "+a);
       // System.out.println("value in double is : "+c);
        System.out.println("value in "+ result);
        
        int firstNumber = 20;
        int secondNumber = 10;

        boolean total = firstNumber==secondNumber;
        boolean total_1 = firstNumber!=secondNumber;
        System.out.println(total_1);


        input.close();


















    }


}