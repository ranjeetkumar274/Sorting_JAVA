import java.util.*;
public class SortingusingBuiltinMethod {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = read.nextInt();
        int nums[] = new int[n];

        System.out.print("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = read.nextInt();
        }

        for(int ele: nums){
            System.out.print(ele+" ");
        }
        System.out.println();

        //builtin method to sort the array

        Arrays.sort(nums);
        for(int ele: nums){
            System.out.print(ele+" ");
        }
        System.out.println();

    }
}
