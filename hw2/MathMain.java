import java.util.Scanner;
import java.text.DecimalFormat;

public class MathMain {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("###,###");
        Scanner scanner = new Scanner(System.in); //꼭 main 안에 있어야함
        System.out.printf("Enter a begin number: ");
        int begin = scanner.nextInt();
        System.out.printf("Enter an end number: ");
        int end = scanner.nextInt();

        long sum = getSumBetween(begin, end);
        System.out.printf("Sum between %d and %d: %d%n", begin, end, sum);

        long product = getProductBetween(begin, end);
        System.out.printf("Product between %d and %d: %s%n", begin, end, df.format(product));
    }
    private static long getSumBetween(int begin, int end) {
        if (begin == end ) return end;
        else return begin + getSumBetween(begin+1 , end);
    }
    private static long getProductBetween(int begin, int end) {
        if(begin == end) return end;
        else return begin * getProductBetween(begin+1,end);
    }

}
