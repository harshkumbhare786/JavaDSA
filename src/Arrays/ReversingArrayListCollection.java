package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ReversingArrayListCollection
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("Original Array : "+list);
        Collections.reverse(list);
        System.out.println("Reversed Array : "+list);
    }
}
