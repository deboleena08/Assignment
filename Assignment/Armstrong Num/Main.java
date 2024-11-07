// A number where the sum of its digits each raised to the power of the number of digits equals the number itself
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int digits = countDigits(num);
        
        if(sumOfPowerOfDigits(num, digits) == num){
            System.out.println(num + " is an Armstrong Number");
        } else {
            System.out.println(num + " is NOT an Armstrong Number");
        }
        sc.close();
    }

    public static int sumOfPowerOfDigits(int x, int power){
        int sum = 0;
        int temp = x;
        while(temp > 0){
            int rem = temp % 10;
            sum += Math.pow(rem, power);
            temp = temp / 10;
        }
        return sum;
    }
    
    public static int countDigits(int x) {
        int count = 0;
        while (x > 0) {
            count++;
            x = x / 10;
        }
        return count;
    }
}
