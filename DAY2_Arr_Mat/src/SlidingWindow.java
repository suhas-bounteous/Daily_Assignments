import java.util.Scanner;

public class SlidingWindow {

    public static int maxSum(int[] nums, int k) {
        int windowSum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int maxSum = windowSum;

        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i];      // add next
            windowSum -= nums[i - k];  // remove previous
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(maxSum(arr, 3)); // Output: 9
    }
}
