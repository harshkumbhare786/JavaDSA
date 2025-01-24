package Arrays;

import java.util.*;

public class DiagonalSumMatrix
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Row number : ");
        int m=sc.nextInt();

        System.out.print("Enter the Column number : ");
        int n=sc.nextInt();

        int[][] arr= new int[100][100];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int sum1=0,sum2=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    sum1=sum1+arr[i][j];
                }
            }
        }
        System.out.println("Sum of main Diagonal : "+sum1);

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    sum2=sum2+arr[i][n-1-i];
                }
            }
        }
        System.out.println("Sum of main Diagonal : "+sum2);

        int total=sum1-sum2;
        if(total<0)
        {
            total=(-1)*total;
        }
        System.out.println("Total Value is : "+total);
    }
}
