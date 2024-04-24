// 1. Write a recursive function to compute power of a number (Xn). Test and trace for 45? Hint: 45 =4 * 44; 40=1.

// 2. Write a recursive function that calculates the factorial of a number.
public class Recursion {
    public static void main(String[] args) {
        System.out.println(power(4, 4));
        System.out.println(factorial(5));
    }
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * power(x, n - 1);
        }
    }
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    
}
