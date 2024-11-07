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
        if(num % sumOfDig(num) == 0){
            int s1 = sumOfDig(num);
            while (s1 > 9) {
                s1 = sumOfDig(s1);
            }
            if(s1 == 1)
            System.out.println(num + " is a Harshad Magic Number");
            else {
            System.out.println(num + " is NOT a Harshad Magic Number");
            }
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
