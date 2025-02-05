package Arrays;

import java.util.Scanner;

public class MartixMultiplication
{
    static void printmatrix(int[][] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the Number of Rows : ");
        int r1 = sc.nextInt();

        System.out.print("Enter the Number of Columns : ");
        int c1 = sc.nextInt();

        System.out.println("-----Matrix 1-----");
        int[][] arr1 = new int[r1][c1];

        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        printmatrix(arr1);

        System.out.println();
        System.out.print("Enter the Number of Rows : ");
        int r2 = sc.nextInt();

        System.out.print("Enter the Number of Columns : ");
        int c2 = sc.nextInt();

        if (c1 != r2)
        {
            System.out.println("Matrix multiplication is not possible. Columns of Matrix 1 must match rows of Matrix 2.");
            return;
        }

        System.out.println("-----Matrix 2-----");
        int[][] arr2 = new int[r2][c2];

        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }
        printmatrix(arr2);


        int[][] mul = new int[r1][c2];
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                for(int k=0;k<c1;k++)
                {
                    mul[i][j]+=(arr1[i][k]*arr2[k][j]);
                }
            }
        }

        System.out.println("----- Multiplication of Two Matrices -----");
        printmatrix(mul);
    }
}
