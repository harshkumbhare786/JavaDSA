package Arrays;

import java.util.*;
class Arraydemo9
{
    static int unique(int[] arr)
    {
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
           ans^=arr[i];
        }
        return ans;
    }

    void array()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n=sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter "+n+" Elements : ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.print("Arrays Element : {");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);

            if(i<arr.length-1)
            {
                System.out.print(",");
            }
        }
        System.out.print("}");
        System.out.println();
        System.out.println();

        System.out.print("The Unique Number is : "+unique(arr));
    }
}
public class UniqueNo
{
    public static void main(String[] args)
    {
        Arraydemo9 obj = new Arraydemo9();
        obj.array();
    }
}
