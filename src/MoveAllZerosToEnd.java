import java.util.Scanner;

public class MoveAllZerosToEnd {
    public static void function(int n, int arr[]) {
        int index=0;
        int temp;
        for(int i=0; i<n; i++){
            if(arr[i]!=0){
                temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
                index++;
            }
        }
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

        function(n, arr);
    }
}
