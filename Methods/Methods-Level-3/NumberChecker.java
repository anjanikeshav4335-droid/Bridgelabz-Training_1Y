
public class NumberChecker {
    public static int countDigits(int num) {
        if (num == 0) return 1;
        int count = 0;
        int temp = Math.abs(num);
        while (temp > 0) {
            temp /= 10;
            count++;
        }
        return count;
    }
    public static int[] getDigitsArray(int num) {
        int size = countDigits(num);
        int[] digits = new int[size];
        int temp = Math.abs(num);
        for (int i = size - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }
    public static boolean isDuckNumber(int num) {
        int[] digits = getDigitsArray(num);
        for (int d : digits) {
            if (d == 0) return true;
        }
        return false;
    }
    public static boolean isArmstrong(int num) {
        int[] digits = getDigitsArray(num);
        int n = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, n);
        }
        return sum == num;
    }
    public static void findLargestTwo(int[] digits) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > first) {
                second = first;
                first = d;
            } else if (d > second && d != first) {
                second = d;
            }
        }
        System.out.println("Largest: " + first + ", Second Largest: " + second);
    }
    public static void findSmallestTwo(int[] digits) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < first) {
                second = first;
                first = d;
            } else if (d < second && d != first) {
                second = d;
            }
        }
        System.out.println("Smallest: " + first + ", Second Smallest: " + second);
    }

    public static void main(String[] args) {
        int number = 153;
        int[] digits = getDigitsArray(number);
        System.out.println("Number: " + number);
        System.out.println("Digit Count: " + countDigits(number));
        System.out.println("Is Duck Number: " + isDuckNumber(number));
        System.out.println("Is Armstrong: " + isArmstrong(number));
        findLargestTwo(digits);
        findSmallestTwo(digits);
    }
}