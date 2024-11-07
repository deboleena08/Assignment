// A number where the sum of its proper divisors (excluding itself) is greater than the number itself.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(divSum(num) > num){
            System.out.println(num + " is Abundant number");
        } else {
            System.out.println(num + " is NOT Abundant number");
        }
        sc.close();
    }

    public static int divSum(int x){
        int sum = 0;
        for(int i = 1; i < x; i++){
            if(x % i == 0){
                sum += i;
            }
        }
        return sum;
    }
}

