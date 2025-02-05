package Arrays;

import java.util.*;

public class MatrixAddition
{
    static void matrix1(int[][] arr1)
    {
        System.out.println();
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[i].length;j++)
            {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void matrix2(int[][] arr2)
    {
        System.out.println();
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr2[i].length;j++)
            {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the Number of Rows : ");
        int r = sc.nextInt();

        System.out.print("Enter the Number of Columns : ");
        int c = sc.nextInt();

        System.out.println("-----Matrix 1-----");
        int[][] arr1 = new int[r][c];

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        matrix1(arr1);

        System.out.println();
        System.out.println("-----Matrix 2-----");
        int[][] arr2 = new int[r][c];

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }
        matrix2(arr2);

        int[][] sum = new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }
        }

        System.out.println("----- Sum of Two Matrices -----");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
