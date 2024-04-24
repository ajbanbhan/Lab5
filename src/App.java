public class App {
    public static void main(String[] args) throws Exception {
        // 1. Instantiate a BMIAnalyzer object with sample weight and height values.
        CalculateBMI bmi = new CalculateBMI(150, 70);
        // 2. Call the calculateBMI() method to calculate the BMI of the person.
        double calculatedBMI = bmi.calculateBMI();
        // 3. Pass the calculated BMI to the findStatus(double bmi) method to determine the weight status.
        String status = bmi.findStatus(calculatedBMI);
        // 4. Display the calculated BMI and weight status on the console.
        System.out.println("BMI: " + calculatedBMI);
        System.out.println("Weight status: " + status);
    }
}
