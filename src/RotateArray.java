import java.util.Scanner;

public class RotateArray {
    public static void function(int n, int arr[], int k){
        int temp[] = new int[k];

        for(int i=0; i<k; i++){
            temp[i] = arr[i];
        }
        for(int i=k ; i<n; i++){
            arr[i-k] = arr[i];
        }
        for(int i=0; i<k; i++){
            arr[n-k+i] = temp[i];
        }
        System.out.println("The rotated array ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements into the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter position to rotate the array: ");
        int k = sc.nextInt();
        function(n, arr, k);
    }
}
