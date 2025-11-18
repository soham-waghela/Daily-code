import java.util.Scanner;

public class SecondLargest {
    public static void function(int n, int arr[]){
        int maximum=arr[0];
        int secondLargest=0;
        for(int i=0;i<n;i++){
            if(maximum<arr[i]){
                maximum=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(secondLargest<arr[i] && arr[i]!=maximum){
                secondLargest=arr[i];
            }
        }
        System.out.println("Second Largest element: "+secondLargest);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements in the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        function(n,arr);
    }
}
