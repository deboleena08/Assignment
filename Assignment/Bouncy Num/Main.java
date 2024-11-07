import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (isMixedDigits(num)) {
            System.out.println(num + " is a Bouncy Number");
        } else {
            System.out.println(num + " is NOT a Bouncy Number");
        }
        sc.close();
    }

    public static boolean isMixedDigits(int num) {
        boolean increasing = true;
        boolean decreasing = true;

        int prev = num % 10;
        num = num / 10;

        while (num > 0) {
            int curr = num % 10;

            if (curr < prev) {
                increasing = false;
            }
            if (curr > prev) {
                decreasing = false;
            }

            prev = curr;
            num = num / 10;
        }

        return !increasing && !decreasing;
    }
}
