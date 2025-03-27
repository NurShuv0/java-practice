import java.util.Scanner;
interface AdvancedArithmetic {
    int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic {
    @Override
    public int divisor_sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
class Solve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        if (n > 1000) {
            System.out.println("Invalid value. n should be at most 1000.Try again, please.");
            return;
        }
        MyCalculator myCalculator = new MyCalculator();
        System.out.println(myCalculator.divisor_sum(n));
    }
}
    

