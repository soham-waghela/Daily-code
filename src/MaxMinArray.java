import java.util.Scanner;

public class MaxMinArray {
    public static void function(int n, int arr[]){
        int maximum=arr[0];
        int minimum=arr[0];
        for(int i=0;i<n;i++){
            if(maximum<arr[i]){
                maximum=arr[i];
            }
            if(minimum>arr[i]){
                minimum=arr[i];
            }
        }
        System.out.println("Maximum: "+maximum);
        System.out.println("Minimum: "+minimum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        function(n,arr);
    }
}
