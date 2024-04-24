// 1. Define a class named BMIAnalyzer with the following instance variables:
//  weight (type: double) , height (type: double) To
// store the height in inches and weight of a person in
// pounds.

// 2. Implement a constructor in the BMIAnalyzer class that takes two parameters: weight
// and height, and initializes the instance variables accordingly.
// 3. Define an instance method named calculateBMI() inside the BMIAnalyzer class that
// calculates the BMI of a person based on the provided weight and height. Use the following
// formula:
//  BMI = weight (lb) / [height (in)]^2 * 703
// 4. Implement another instance method named findStatus(double bmi) inside the BMIAnalyzer
// class that categorizes the weight status of a person based on the provided BMI value. The
// method should return a String indicating one of the following weight statuses:

// 5. Create a main method to test your BMIAnalyzer class.
// Inside the main method:
//  Instantiate a BMIAnalyzer object with sample
// weight and height values.
//  Call the calculateBMI() method to calculate the
// BMI of the person.
//  Pass the calculated BMI to the findStatus(double bmi) method to determine the
// weight status.
//  Display the calculated BMI and weight status on the console.
public class CalculateBMI {
    double weight;
    double height;
    public CalculateBMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }
    public double calculateBMI() {
        return weight / (height * height) * 703;
    }
    public String findStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }
    
}
