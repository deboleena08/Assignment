// A number where the sum of its digits powered by their respective positions equals the number itself.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); 
        int x = num; 
        String temp = String.valueOf(num);  
        int length = temp.length();
        int sum = 0;
        while(num > 0){
            int rem = num % 10;
            sum = sum + (int)Math.pow(rem, length);
            num /= 10;
            length--;
        }
        if(x == sum){
            System.out.println(x+" is a Disarium number");
        } else {
            System.out.println(x+" is NOT a Disarium number");
        }
        sc.close();
    }
}