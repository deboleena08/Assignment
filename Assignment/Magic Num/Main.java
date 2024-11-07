// A number where the sum of its digits repeatedly added together equals 1.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum1 = sumOfNum(num);
        while(sum1 > 9){
            sum1 = sumOfNum(sum1);
        }
        if(sum1 == 1){
            System.out.println(num + " is Magic Number");
        } else {
            System.out.println(num + " is NOT Magic number");
        }

        sc.close();
    }

    public static int sumOfNum(int x){
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
