import java.util.ConcurrentModificationException;
import java.util.Locale;
import java.util.Scanner;

enum Command {
    QUIT,ADD,LIST,AVG,SUM,STD,INVALID;
}

public class ArrayEnum {
    public static void main(String[] args) {
        int [] values = new int[100];
        int index = 0;

        final Scanner scanner = new Scanner(System.in);


        while(true) {
            final Command command = getCommand(scanner); //enum
            if (command == Command.QUIT) {
                System.out.println("Bye!");
                break;
            }
            switch (command) {
                case ADD:
                    final int newValue = getValue(scanner);
                    values[index] = newValue;
                    index++;
                    break;
                case LIST:
                    printList(values, index);
                    break;
                case AVG:
                    System.out.printf("%.2f%n", getAvg(values, index));
                    break;
                case SUM:
                    System.out.printf("%d%n", getSum(values, index));
                    break;
                case STD:
                    System.out.printf("%.2f%n", getStd(values, index));
                    break;
                case INVALID:
                    System.out.printf("Invalid Command%n");
            }
        }
        scanner.close();
    }
    public static Command getCommand(Scanner scanner) {
        String a = scanner.next();
        switch (a.toUpperCase()) {
            case "ADD":
                return Command.ADD;
            case "LIST":
                return Command.LIST;
            case "AVG":
                return Command.AVG;
            case "SUM":
                return Command.SUM;
            case "STD":
                return Command.STD;
            case "QUIT":
                return Command.QUIT;
        }
        return Command.INVALID;
    }
    public static int getValue(Scanner scanner) {
        int a = scanner.nextInt();
        return Integer.valueOf(a);
    }
    public static void printList(int value[],int index) {
        for(int i=0; i<index; i++) {
            System.out.printf("%d ",value[i]);
        }
        System.out.printf("%n");
    }
    public static double getAvg(int value[],int index) {
        return getSum(value,index)/index;
    }
    public static int getSum(int value[],int index) {
        int sum = 0;
        for(int i=0; i<index; i++) {
            sum += value[i];
        }
        return sum;
    }
    public static double getStd(int value[],int index) {
        double avg = getAvg(value,index);
        int sum = 0;
        for(int i=0; i<index; i++) {
            sum += Math.pow(value[i]-avg,2);
        }
        return Math.sqrt(sum/index);
    }
}
