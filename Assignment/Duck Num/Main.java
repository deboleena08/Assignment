// A number that contains at least one '0' but not at the beginning.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();  
        String temp = String.valueOf(num);  
        boolean isDuck = false; 

        if (temp.charAt(0) != '0') {
            for (int i = 1; i < temp.length(); i++) {
                if (temp.charAt(i) == '0') {
                    isDuck = true;  
                    break;
                }
            }
            if (isDuck) {
                System.out.println(num + " is a Duck Number");
            } else {
                System.out.println(num + " is NOT a Duck Number");
            }
        } else {
            System.out.println("Invalid Duck Number");
        }
        sc.close();
    }
}
