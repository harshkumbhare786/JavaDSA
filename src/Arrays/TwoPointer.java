package Arrays;

import java.util.Scanner;

// Sort and Array consist of only 0 and 1

class ArrayDemo1234 {
    void arrays() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
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

        // Sorting the array
        sortZeroandOne(arr);

        System.out.print("Sorted Array: {");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]);
            if (i < arr.length - 1)
            {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        sc.close();
    }

    static void sortZeroandOne(int[] arr)
    {
        int count = 0;

        // Count the number of zeroes
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == 0)
            {
                count++;
            }
        }

        // Place zeroes first, then ones
        for (int i = 0; i < arr.length; i++)
        {
            if (i < count)
            {
                arr[i] = 0;
            }
            else
            {
                arr[i] = 1;
            }
        }
    }
}

public class TwoPointer
{
    public static void main(String[] args)
    {
        ArrayDemo1234 obj = new ArrayDemo1234();
        obj.arrays();
    }
}
