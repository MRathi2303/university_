package sem_3rd.practicals;

public class Smith_Number {
    public static void main(String[] args) {
        int number = 22;
        System.out.println(number + (isSmithNumber(number) ? " is a Smith number." : " is not a Smith number."));
    }

    private static boolean isSmithNumber(int num) {
        if (num < 2 || isPrime(num)) return false;
        return sumOfDigits(num) == sumOfPrimeFactorsDigits(num);
    }

    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    private static int sumOfPrimeFactorsDigits(int num) {
        int sum = 0;
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                sum += sumOfDigits(i);
                num /= i;
            }
        }
        return sum;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}