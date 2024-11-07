// A number with an even number of digits that can be split into two parts, and the square of their sum equals the number
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();  
        String temp = String.valueOf(num);  
        int length = temp.length();
        if(length % 2 == 0){
            int mid = length / 2;
            int leftPart = Integer.parseInt(temp.substring(0, mid));
            int rightPart = Integer.parseInt(temp.substring(mid));
            int sum = leftPart + rightPart;
            if (sum * sum == num) {
                System.out.println(num + " is a special number.");
            } else {
                System.out.println(num + " is NOT a special number.");
            }
        } else {
            System.out.println("The number does not have an even number of digits.");
        }
        sc.close();
    }
}
