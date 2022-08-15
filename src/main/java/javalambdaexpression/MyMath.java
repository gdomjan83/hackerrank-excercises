package javalambdaexpression;

/*
Write the following methods that return a lambda expression performing a specified action:

PerformOperation isOdd(): The lambda expression must return true if a number is odd or false if it is even.
PerformOperation isPrime(): The lambda expression must return true if a number is prime or false if it is composite.
PerformOperation isPalindrome(): The lambda expression must return true if a number is a palindrome or false if it is not.
 */

public class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }
    public PerformOperation isOdd() {
        return num -> num % 2 != 0;
    }

    public PerformOperation isPrime() {
        return num -> {
            if (num == 2) {
                return true;
            }
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        };
    }

    public PerformOperation isPalindrome() {
        return num -> {
            char[] input = String.valueOf(num).toCharArray();
            for (int i = 0; i < input.length / 2; i++) {
                if (input[i] != input[input.length - 1 - i]) {
                    return false;
                }
            }
            return true;
        };
    }
}