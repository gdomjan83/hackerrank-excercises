package primechecker;

public class PrimeChecker {

    public boolean isPrime(int number) {
        if (number < 2) {
            throw new IllegalArgumentException("Can only check a number greater than 1.");
        }
        if (number == 2) {
            return true;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
