package Arrays;

import java.util.*;

class Arraydemo4 {
    static int pairsum(int[] arr, int target) {
        int ans = 0;
        System.out.println("Pairs with Target Sum (" + target + "):");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Index: (" + i + ", " + j + "), Values: (" + arr[i] + ", " + arr[j] + ")");
                    ans++;
                }
            }
        }
        return ans;
    }

    void array() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter " + n + " Elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array Elements: {");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("}");
        System.out.println();

        System.out.print("Enter Target: ");
        int target = sc.nextInt();

        int count = pairsum(arr, target);
        System.out.println("The number of pairs with the target sum is: " + count);
    }
}

public class TargetSum {
    public static void main(String[] args) {
        Arraydemo4 obj = new Arraydemo4();
        obj.array();
    }
}
