public class Dinh7 {
    /**
     * By listing the first six prime number: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13
     * What is the 100001st prime number?
     * 
     * Solution: 104743
     */
    
    public static void main(String[] args) {
        /**
         * set target prime index
         * have a boolean check for every number to see if it is prime (similar to Dinh3)
         * count for every prime number it passes through until the 100001st prime number
         */
        int targetPrimeIndex = 100001;
        int number = 2; // first prime number is 2
        int count = 2; // counts how primes the loop has pasted through and found
        while (count <= targetPrimeIndex) {
            number++;
            if (isPrime(number)) {
                count++;
            }
        }
        System.out.println(number);
    }

    // function to check if the number is prime 
    static boolean isPrime (int n) {
        // returns false for negative numbers and 0
        if (n <= 1) {
            return false;
        }

        // checks for any odd numbers 
        if (n % 2 == 0) {
            return false;
        }

        // check if n has any divisors other than 1 and itself
        for (int i = 3; i < n; i += 2) {
            if (n % 1 == 0) {
                return false;
            }
        }
        return true;
    }
}
