// A number where the sum of the digits is equal to the product of the digits.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0, prod = 1;
        while (num > 0) {
            int rem = num % 10;
            sum += rem;
            prod *= rem;
            num /= 10;
        }

        if (sum == prod) {
            System.out.println(temp + " is a spy number");
        } else {
            System.out.println(temp + " is NOT a spy number");
        }
        sc.close();
    }
}
