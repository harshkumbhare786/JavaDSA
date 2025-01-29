package Arrays;

import java.util.Scanner;

// Sort an Array consisting of only 0s and 1s using the Two-Pointer Approach

class ArrayDemo1234 {
    void arrays() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of Elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter " + n + " Elements (0s and 1s only): ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Original Array: {");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        // Sorting the array using the Two-Pointer Approach
        sortZeroandOne(arr);

        System.out.print("Sorted Array: {");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        sc.close();
    }

    static void sortZeroandOne(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            // Move left pointer forward if it's already 0
            while (left < right && arr[left] == 0) {
                left++;
            }
            // Move right pointer backward if it's already 1
            while (left < right && arr[right] == 1) {
                right--;
            }

            // Swap elements if left is at 1 and right is at 0
            if (left < right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
    }

    // Swap function to exchange two elements in the array
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

public class TwoPointer {
    public static void main(String[] args) {
        ArrayDemo1234 obj = new ArrayDemo1234();
        obj.arrays();
    }
}
