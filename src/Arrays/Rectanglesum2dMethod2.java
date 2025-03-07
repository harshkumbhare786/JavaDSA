package Arrays;

// Pre-calculating the horizontal sum for each row in the matrix.//

import java.util.*;

public class Rectanglesum2dMethod2
{
    static void findPrefixsumMatrix(int[][] matrix)
    {
        int r=matrix.length;
        int c=matrix[0].length;

        //Tranverse horizontally to calculate row-wise prefix sum

        for(int i=0;i<r;i++)
        {
            for(int j=1;j<c;j++)
            {
                matrix[i][j]+=matrix[i][j-1];
            }
        }
    }

    static int findsum1(int[][] matrix,int l1,int r1,int l2,int r2)
    {
        int sum=0;
        findPrefixsumMatrix(matrix);

        for(int i=l1;i<=l2;i++)
        {
            // r1 to r2 sum of row 1
            if(r1>=1)
            {
                sum+=matrix[i][r2]-matrix[i][r1-1];
            }
            else
            {
                sum+=matrix[i][r2];
            }
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter thre Number of Rows : ");
        int r=sc.nextInt();

        System.out.print("Enter the Number of Columns : ");
        int c=sc.nextInt();

        int totalElements=r*c;
        int[][] matrix = new int[r][c];
        System.out.println("Enter "+totalElements+ " Elements : ");

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter l1 : ");
        int l1=sc.nextInt();

        System.out.print("Enter r1 : ");
        int r1=sc.nextInt();

        System.out.print("Enter l2 : ");
        int l2=sc.nextInt();

        System.out.print("Enter r2 : ");
        int r2=sc.nextInt();

        System.out.println("Rectangle Sum : "+findsum1(matrix,l1,r1,l2,r2));
    }
}
