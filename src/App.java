import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        // 1. Instantiate a BMIAnalyzer object with sample weight and height values.
        CalculateBMI bmi = new CalculateBMI(150, 70);
        // 2. Call the calculateBMI() method to calculate the BMI of the person.
        double calculatedBMI = bmi.calculateBMI();
        // 3. Pass the calculated BMI to the findStatus(double bmi) method to determine the weight status.
        String status = bmi.findStatus(calculatedBMI);
        // 4. Display the calculated BMI and weight status on the console.
        System.out.println("BMI: " + calculatedBMI);
        System.out.println("Weight status: " + status);

        // 5. Test the Sum class
        Sum sum = new Sum();
        int input = 0;
        while (input >= 0) {
            System.out.print("Enter a number: ");
            input = scanner.nextInt();
            if (input >= 0) {
                System.out.println("Odd sum: " + sum.computeOddSum(input));
                System.out.println("Even sum: " + sum.computeEvenSum(input));
            }
        }
        
    }
}
