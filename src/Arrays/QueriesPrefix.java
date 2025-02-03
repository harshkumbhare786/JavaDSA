package Arrays;

import java.util.*;

class Arraydemo12345 {
    void Array() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
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
        System.out.println();

        int[] prefixsum = PrefixArraySum(arr);
        System.out.print("Prefix Arrays: {");
        for (int i = 0; i < prefixsum.length; i++) {
            System.out.print(prefixsum[i]); // **Fixed incorrect array reference**
            if (i < prefixsum.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("}");
        System.out.println();

        prefixQueries(prefixsum, sc);
        sc.close(); // **Closed Scanner to prevent resource leaks**
    }

    static int[] PrefixArraySum(int[] arr) {
        int n = arr.length;
        int[] prefixsum = new int[n];
        prefixsum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixsum[i] = arr[i] + prefixsum[i - 1];
        }
        return prefixsum;
    }

    static void prefixQueries(int[] prefixsum, Scanner sc) { // **Fixed Scanner management**
        System.out.print("Enter Queries: ");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.print("Enter Range (l r): "); // **Fixed prompt order**
            int l = sc.nextInt();
            int r = sc.nextInt();

            if (l < 1 || r > prefixsum.length || l > r) {
                System.out.println("Invalid range. Please enter valid indices.");
                continue;
            }

            int ans = (l == 1) ? prefixsum[r - 1] : prefixsum[r - 1] - prefixsum[l - 2];
            System.out.println("The sum is: " + ans);
        }
    }
}

public class QueriesPrefix {
    public static void main(String[] args) {
        Arraydemo12345 obj = new Arraydemo12345();
        obj.Array();
    }
}
