import java.util.Scanner;

public class SwampNumbers {

    static void function(int a, int b){
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 1st number: ");
        int a  = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();
        function(a,b);
    }
}
