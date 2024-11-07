// A number divisible by 7 or ends with a 7
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();  
        String temp = String.valueOf(num);  
        int length = temp.length();
        
        if(temp.charAt(length-1) == '7' || num % 7 == 0){
            System.out.println(num +" is a Duck Number");
        } else {
            System.out.println(num +" is NOT a duck number");
        }
        sc.close();
    }
}
