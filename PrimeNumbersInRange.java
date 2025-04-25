public class PrimeNumbersInRange {

    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100:");
        
        for (int number = 1; number <= 100; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Found a divisor, not prime
            }
        }

        return true; // No divisors found, it's a prime number
    }
}