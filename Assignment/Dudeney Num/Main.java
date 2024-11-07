// A number where the sum of the digits equals the cube root of the number.

// A Harshad number where the sum of the digits, when repeatedly added, equals 1.

// A number where the sum of the digits of its square is equal to the number itself.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num == 0){
            System.out.println("Zero is not accepteable!");
        }

        double cubeRoot = Math.cbrt(num);
        int sumOfDigits = sumOfDig(num);

        if(sumOfDigits == (int)cubeRoot){
            System.out.println(num + " is Dudeney Number");
        } else {
            System.out.println(num + " is NOT Dudeney Number");
        }

        sc.close();
    }

    public static int sumOfDig(int x){
        int sum = 0;
        int temp = x;
        while(temp > 0){
            int rem = temp % 10;
            sum += rem;
            temp = temp / 10;
        }
        return sum;
    }
}
