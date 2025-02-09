package Arrays;

import java.util.Scanner;
public class SparseMatrix
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of Row : ");
        int m=sc.nextInt();

        System.out.print("Enter the Number of Column : ");
        int n=sc.nextInt();

        int[][] a= new int[m][n];
        System.out.println("Enter the Elements of Matrix : ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        int size=0;
        for(int i=0;i<m;i++)
        {
            for (int j = 0; j < n; j++)
            {
                if(a[i][j]!=0)
                {
                    size++;
                }
            }
        }

        int[][] sp = new int[size][3];
        int row=0;
        for(int i=0;i<m;i++)
        {
            for (int j = 0; j < n; j++)
            {
                if(a[i][j]!=0)
                {
                   sp[row][0]=i;
                   sp[row][1]=j;
                   sp[row][2]=a[i][j];
                   row++;
                }
            }
        }
        System.out.println();
        System.out.println("----- Sparse Matrix -----");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(sp[i][j] + " ");
            }
            System.out.println();
        }
    }
}
