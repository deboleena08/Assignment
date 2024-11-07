// A number where the sum of the digits of its square is equal to the number itself.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num % sumOfDig(num) == 0){
            System.out.println(num + " is a Harshad Number");
        } else {
            System.out.println(num + " is NOT a Harshad Number");
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
