import java.util.*;
public class BuubleSort {
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

        //Bubblesort

        for(int i = 0; i < n-1; i++){
                for(int j = 0; j < n-1-i; j++) { //for optimization we did this {j < n-1-i}
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

}
