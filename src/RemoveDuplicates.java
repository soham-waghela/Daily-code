import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void function(int n, int arr[]){
        LinkedHashSet<Integer> dup = new LinkedHashSet<>();
        for(int i=0; i<n; i++){
            dup.add(arr[i]);
        }
        for(int x :dup){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        function(n,arr);
    }
}
