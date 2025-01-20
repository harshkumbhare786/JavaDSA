package Arrays;

import java.util.*;

class Arraydemo10 {
    // Method to find the first (maximum) number in the array
    static int firstmax(int[] arr) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }

    // Method to find the second maximum number in the array
    static int findSecondMax(int[] arr) {
        int mx = firstmax(arr);
        int secondMax = Integer.MIN_VALUE;

        // Replace occurrences of the first maximum with Integer.MIN_VALUE
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == mx)
            {
                arr[i] = Integer.MIN_VALUE;
            }
        }

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > secondMax)
            {
                secondMax = arr[i];
            }
        }

        return secondMax;
    }
    void array()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter " + n + " Elements: ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array Elements: {");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]);
            if (i < arr.length - 1)
            {
                System.out.print(", ");
            }
        }
        System.out.println("}");
        System.out.println();

        // Finding the second maximum number
        System.out.println("The Second Maximum Number in Array: " + findSecondMax(arr));
    }
}

public class SecondMaxandSecondMinArray
{
    public static void main(String[] args)
    {
        Arraydemo10 obj = new Arraydemo10();
        obj.array();
    }
}
