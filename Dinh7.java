// 104743
public class Dinh7 {
    /**
     * By listing the first six prime number: 2, 3, 5, 7, 11, and 13, we can see
     * that the 6th prime is 13
     * What is the 100001st prime number?
     * 
     * Solution: 104743
     */

    public static void main(String[] args) {
        /**
         * set target prime index
         * have a boolean check for every number to see if it is prime (similar to
         * Dinh3)
         * count for every prime number it passes through until the 100001st prime
         * number
         * sieve of eratosthenes?
         */
        int targetPrimeIndex = 10001;
        // these are base cases
        int number = 2; // start the number at 2 because that is the first prime numnber
        int count = 2; // same thing applies to count 

        // counts the number that are primes and adds on until it matches the targetPrimeIndex
        while (count <= targetPrimeIndex) {
            number++;
            if (primeNumChecker(number)) {
                count++;
            }
        }
        // prints the solution
        System.out.println(number);
    }

    // function that checks if the number is prime 
    static boolean primeNumChecker(int n) {

        // checks if the number is negative or 1
        // if it is, then it returns as a false 
        if (n <= 1) {
            return false;
        }

        // checks for any even number
        // returns false since any even number (except 2) is not prime
        if (n % 2 == 0) {
            return false;
        }

        // checks if the number is divisable by any other number
        // implementation of something like the sieve of eratosthenes
        for (int i = 3; i < n; i += 2) {
            if (n % 1 == 0) {
                return false;
            }
        }
        return true;
    }
}
