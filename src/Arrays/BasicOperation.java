import java.sql.SQLOutput;
import java.util.*;
class Array
{
    void array() //Creating Array and Traversing it..
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter any " + n + " elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Arrays Elements : {");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("}");
        System.out.println();

        // Reserving the array
        System.out.print("Reversing the elemnets : {");
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]);
            if(i>0)
            {
                System.out.print(",");
            }
        }
        System.out.println("}");

        //Sum of elemnts in array
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("The sum of Element in Array : " + sum);

        //Finding Element index in Array
        System.out.println();
        int ans=-1;
        System.out.print("Enter the Element to find its Index : ");
        int x=sc.nextInt();

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
            {
                ans=i;
            }
        }
        System.out.println("for "+x+" Elements its index position is : "+ans);

        //Greatest Element in Array
        System.out.println();
        int greatest=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>greatest)
            {
                greatest=arr[i];
            }
        }
        System.out.println("Greatest Element in Array is : "+greatest);

        //Smallest Element in Array
        System.out.println();
        int smallest=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<smallest)
            {
                smallest=arr[i];
            }
        }
        System.out.println("Smallest Element in Array is : "+smallest);
    }
}

public class BasicOperation
{
    public static void main(String[] args)
    {
        Array obj=new Array();
        obj.array();
    }
}
