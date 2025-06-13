import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Rate of Interest (in %): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = scanner.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;

        // Displaying the result
        System.out.println("Simple Interest is: " + simpleInterest);
        
    }
}
