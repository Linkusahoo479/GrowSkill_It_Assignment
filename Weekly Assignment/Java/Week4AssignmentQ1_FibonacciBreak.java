package Weekly_Assignment;

public class Week4AssignmentQ1_FibonacciBreak {

    public static void main(String[] args) {

        int n = 10; //if we take n=12 then output will be right
        int firstNum = 0;
        int secondNum = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {

            if (firstNum > 100) {
                break;
            }

            System.out.print(firstNum + " ");

            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }
}
/*
 * Q1. Fibonacci Series with Condition

Write a Java program to:

Print Fibonacci series up to n terms
Stop printing using break if any number in the series becomes greater than 100

👉 Example:
Input: n = 10
Output: 0 1 1 2 3 5 8 13 21 34 55 89
 */