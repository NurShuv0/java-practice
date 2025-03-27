import java.util.Scanner;
public class BinaryConversion {
    public static void main(String args[])
    {
        int count = 0;
        Scanner input = new Scanner(System.in);
        int decimal = input.nextInt();
        String binary = Integer.toBinaryString(decimal);
        System.out.println(binary);
        for(int i = 0; i < binary.length(); i++)
        {
            if(binary.charAt(i) == '0')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
