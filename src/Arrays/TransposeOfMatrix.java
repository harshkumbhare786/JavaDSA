package Arrays;

import java.util.*;

public class TransposeOfMatrix
{
    static void printMatrix(int[][] arr,int n,int m)
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the Number of rows : ");
        int n=sc.nextInt();

        System.out.print("Enter the Number of Columns : ");
        int m=sc.nextInt();

        int [][] arr=new int[n][m];
        System.out.println("-----Matrix------");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("----Transpose of Matrix----");
        printMatrix(arr,n,m);
    }
}
