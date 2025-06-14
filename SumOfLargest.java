import java.util.Scanner;

public class SumOfLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int largest = Math.max(a, Math.max(b, c));
        int sum = a + b + c;
        double average = sum / 3.0;

        System.out.println("Sum of the largest number is: " + largest);
        System.out.println("Average of the three numbers is: " + average);
    }
}
