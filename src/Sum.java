// Write the following 2 methods:
// public int ComputeOddSum(int input)
// public int ComputeEvenSum(int input)
// The method ComputeOddSum find the sum of all odd numbers less than input.
// The method ComputeEvenSum find the sum of all even numbers less than input.
// Now, test these 2 methods by prompting the user to input a number each time until a negative
// number is entered.
public class Sum {
    public int computeOddSum(int input) {
        int sum = 0;
        for (int i = 1; i < input; i += 2) {
            sum += i;
        }
        return sum;
    }
    public int computeEvenSum(int input) {
        int sum = 0;
        for (int i = 0; i < input; i += 2) {
            sum += i;
        }
        return sum;
    }
    
}
