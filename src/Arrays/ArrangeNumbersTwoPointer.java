package Arrays;

import java.util.Scanner;

class Arr {
    void arrays() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter " + n + " Elements: ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("Original Array: {");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        int[] sortedSquares = sortSquare(arr);

        System.out.print("Sorted Squared Elements: {");
        for (int i = 0; i < sortedSquares.length; i++)
        {
            System.out.print(sortedSquares[i]);
            if (i < sortedSquares.length - 1)
            {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    static int[] sortSquare(int[] arr) {
        int left = 0, right = arr.length - 1;
        int[] ans = new int[arr.length];
        int k = arr.length - 1; // Start filling from the end

        while (left <= right)
        {
            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];

            if (leftSquare > rightSquare)
            {
                ans[k--] = leftSquare;
                left++;
            } else {
                ans[k--] = rightSquare;
                right--;
            }
        }

        return ans; // Return the sorted squares array
    }
}

public class ArrangeNumbersTwoPointer
{
    public static void main(String[] args)
     {
        Arr obj = new Arr();
        obj.arrays();
    }
}
