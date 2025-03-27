import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class max_number{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        Integer[] arr = new Integer[size];
        for(int i = 0; i < size; i++)
        {
            arr[i] = input.nextInt();
        }
        for(int i = 0; i < size; i++)
        {
            System.out.println(arr[i]);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("The highest 3 numbers are " + arr[0] + " " + arr[1] + " " + arr[2]);
        input.close();
    }
}