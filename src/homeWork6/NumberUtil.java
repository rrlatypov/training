package homeWork6;

public class NumberUtil {
    public static int[] primeNumbers(int[] digits) {

        for (int i = 0; i < digits.length; i++) {
            int s = 0;
            for (int j = 2; j < digits[i] - 1; j++) {
                if (digits[i] % j == 0) {
                    s++;
                }
            }
            if (s == 0) {
                System.out.println(digits[i] + " является простым числом");
            }
        }
        return digits;
    }


    public static boolean primeNumber(int digit) {
        boolean newDigit = false;
        for (int j = 2; j <= digit - 1; j++) {
            if (digit % j == 0) {
                newDigit = true;
            }
        }
        if (digit == 1 || digit == 2 || digit == 3) {
            return true;
        }
        if (newDigit) {
            return false;
        } else {
            return true;
        }
    }


    public static int denominator(int digit1, int digit2) {
        if (digit1 == digit2) {
            System.out.println(digit1);

        }
        if (digit1 < digit2) {
            for (int i = 1; i <= digit2; i++) {
                int denominator = i * digit1 % digit2;
                if (denominator == 0) {
                    System.out.println(i * digit1);
                    break;
                }
            }
        }

        if (digit1 > digit2) {
            for (int i = 1; i <= digit1; i++) {
                int denominator = i * digit2 % digit1;
                if (denominator == 0) {
                    System.out.println(i * digit2);
                    break;
                }
            }
        }
        return digit1 & digit2;
    }

}