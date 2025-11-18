import java.util.*;
public class Palindrome {
    public static void function(int n){
        int lastDigit = 0;
        int reverseNumber = 0;
        int temp = n;
        while (n > 0) {
            lastDigit = n % 10;
            n = n / 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
        }
        if (reverseNumber == temp) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        function(n);
    }
}

