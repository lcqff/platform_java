import java.util.Scanner;

public class FactorialMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int res;
        for(int i=1; i<= num; i++) {
            System.out.println("Factorial of " + i + " = " + getFactorial(i));
        }
    }
    private static long getFactorial(final int n) {
        if(n == 0 )
            return 1;
        else
            return (n*getFactorial(n-1));
    }
}

