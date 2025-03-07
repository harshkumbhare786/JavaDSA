package Arrays;
import java.util.*;

public class Rectanglesum2d
{
    static int findsum(int[][] matrix,int l1,int r1,int l2,int r2)
    {
        int sum=0;
        for(int i=l1;i<=l2;i++)
        {
            for(int j=r1;j<=r2;j++)
            {
                sum+=matrix[i][j];
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

        System.out.println("Rectangle Sum : "+findsum(matrix,l1,r1,l2,r2));
    }
}
