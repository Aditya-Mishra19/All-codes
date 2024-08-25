import java.util.Scanner;

public class Main {
    public static int findSecondLargest(int[] nums) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    public static int findOccurrenceOfSecondLargest(int k, int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == k) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // 1st step: find the second largest element
        int secondLargest = findSecondLargest(nums);
        int count = findOccurrenceOfSecondLargest(secondLargest, nums);
        System.out.println(count);
    }
}
