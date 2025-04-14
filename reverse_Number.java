import java.util.Scanner;

class reverse_Number {
    int nnum = 0;
    int getInput() {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        return num;
    }
    void reverse(int num) {
        while (num != 0) {
            int rem = num % 10;
            nnum = (nnum * 10) + rem;
            num /= 10;
        }
        System.out.println("Reversed number: " + nnum);
    }

    public static void main(String[] args) {
        reverse_Number obj = new reverse_Number();
        int num = obj.getInput();
        obj.reverse(num);
    }
    
}
