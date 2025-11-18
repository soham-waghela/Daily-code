import java.util.Scanner;

public class BinarySearch {
    public static void function(int n, int arr[], int target){
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                System.out.println("Element found");
                return;
            } else if (target<arr[mid]) {
                high=mid-1;
            }else if(target>arr[mid]) {
                low=mid+1;
            }
        }
        System.out.println("Element not found");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements in the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Which element you want to find: ");
        int target = sc.nextInt();
        function(n,arr,target);
    }
}
