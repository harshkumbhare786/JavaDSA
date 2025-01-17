package Arrays;
class ArrayDemo
{
    static void printarray(int[] arr)
    {
       for(int i=0;i<arr.length;i++)
       {
           System.out.print(arr[i] +" ");
       }
       System.out.println();
    }

    void array()
    {
        int[] a=new int[4];
        a[0]=5;
        a[1]=2;
        a[2]=8;
        a[3]=9;

        System.out.print("Original Array : ");
        printarray(a);

        //copy array from a to b
        int[] b=a.clone();
        System.out.print("Cloned Array : ");
        printarray(b);

        b[0]=0;
        b[1]=0;
        System.out.println();

        System.out.print("Original Array After changing value : ");
        printarray(a);

        System.out.print("Cloned Array After changing value: "); //deep copy
        printarray(b);
    }
}

public class Cloning
{
    public static void main(String[] args)
    {
        ArrayDemo obj=new ArrayDemo();
        obj.array();
    }
}
