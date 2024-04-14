package programming.programming;
import java.util.Scanner;

public class MaxOf2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int i = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int j = scanner.nextInt();

        if (i > j)
            System.out.println(i + " is greater than " + j);
        else if (j > i)
            System.out.println(j + " is greater than " + i);
        else
            System.out.println("Both numbers are equal.");

        scanner.close();
    }
}
