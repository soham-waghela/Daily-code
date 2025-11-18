import java.util.Scanner;

public class LinearSearch {
    public static void function(int n, int arr[],int elementSearch){
        boolean present=false;
        int index=-1;
        for(int i=0; i<n; i++){
            if(arr[i]==elementSearch){
                present=true;
                index = i;
                break;
            }
        }
        if(present){
            System.out.println("Element is present at index "+index);
        }else{
            System.out.println("Element is not present");
        }
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
        int elementSearch = sc.nextInt();
        function(n,arr,elementSearch);
    }
}
