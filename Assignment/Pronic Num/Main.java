// A number that is the product of two consecutive integers.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (isProd(num)) {
            System.out.println(num + " is the product of two consecutive integers");
        } else {
            System.out.println(num + " is NOT the product of two consecutive integers");
        }

        sc.close();
    }

    public static boolean isProd(int num) {
        for (int i = 1; i <= num; i++) {
            if (i * (i + 1) == num) {
                return true;
            }
        }
        return false;
    }
}
