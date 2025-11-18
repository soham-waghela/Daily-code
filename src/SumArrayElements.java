import java.util.*;
public class SumArrayElements {
    public static void function(int n, int arr[]){
        int sum=0;
        for(int i=0; i<n; i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements in the array: ");
        for(int i=0; i<n ;i++){
            arr[i] = sc.nextInt();
        }
        function(n,arr);
    }
}
