package Arrays;

import java.util.Scanner;

public class RotatingArrayMatrix90degree
{
    // Function to print the matrix
    static void printMatrix(int[][] arr, int n, int m)
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Function to transpose the matrix
    static void Transposematrix(int[][] arr, int n, int m)
    {
        int[][] ans = new int[m][n]; // Transposed matrix
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                ans[j][i] = arr[i][j]; // Transpose logic
            }
        }

        // Copy transposed values back to arr
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                arr[i][j] = ans[i][j];
            }
        }
    }

    // Function to reverse each row
    static void reverse(int[] arr)
    {
        int i = 0, j = arr.length - 1;
        while(i < j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    // Function to rotate the matrix 90 degrees clockwise
    static void rotatematrix(int[][] arr, int n, int m)
    {
        Transposematrix(arr, n, m);
        for(int i = 0; i < m; i++)
        {
            reverse(arr[i]); // Reverse each row of the transposed matrix
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of rows: ");
        int n = sc.nextInt();

        System.out.print("Enter the Number of Columns: ");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        System.out.println("-----Matrix Input------");
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("----Original Matrix----");
        printMatrix(arr, n, m);

        System.out.println("----Rotation of Matrix (90 degrees)----");
        rotatematrix(arr, n, m);
        printMatrix(arr, m, n);

        sc.close();
    }
}
