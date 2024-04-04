import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.print("enter the digits of the array : ");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        //selection sort

        for(int i = 0; i < n-1; i++){
            int min = Integer.MAX_VALUE;
            int idx = -1;
            for(int j = i; j < n; j++){
                if(arr[j] < min){
                    min = arr[j];
                    idx = j;
                }
            }
            //swapping
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }

        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}