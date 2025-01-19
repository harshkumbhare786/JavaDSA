package Arrays;

import java.util.*;

class Arraydemo2
{
    static int[] SmallestandLargest(int[] arr) {
        Arrays.sort(arr);
        int[] ans = {arr[0], arr[arr.length - 1]};
        return ans;
    }

    void array()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter " + n + " Elements : ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array Elements : {");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]);

            if (i < arr.length - 1)
            {
                System.out.print(",");
            }
        }
        System.out.print("}");
        System.out.println();

        System.out.println("Smallest value in array : " + arr[0]);
        System.out.println("Largest Value in array : " + arr[arr.length - 1]);
    }
}
public class LargestandSmallestno
{
    public static void main(String[] args)
    {
        Arraydemo2 obj = new Arraydemo2();
        obj.array();
    }
}
