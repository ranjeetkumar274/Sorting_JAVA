import java.util.*;

public class mergesort {

    public static void merge(int[] arr, int low, int mid, int high) {
        int leftSize = mid - low + 1;
        int rightSize = high - mid;

        int[] left = new int[leftSize];
        int[] right = new int[rightSize];

        // Copy data to temporary arrays left[] and right[]
        for (int i = 0; i < leftSize; i++) {
            left[i] = arr[low + i];
        }
        for (int i = 0; i < rightSize; i++) {
            right[i] = arr[mid + 1 + i];
        }

        // Merge the temporary arrays back into arr[low....high]

        int i = 0, j = 0;
        int k = low;
        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of left[], if any
        while (i < leftSize) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // Copy the remaining elements of right[], if any
        while (j < rightSize) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void ms(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            ms(arr, low, mid);
            ms(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of the array: ");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array before sorting:");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        // Sort the array using merge sort
        ms(arr, 0, n - 1);

        System.out.println("Array after sorting:");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
