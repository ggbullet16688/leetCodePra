/**
  Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.
**/

public class june23 {
    public static boolean reverse(int x) {
        final int TEN = 10;
        final int ZERO = 0;

        int input = x;
        int popOffDigit;
        int num = ZERO;

        if (input < 0 || (input % TEN == 0 && input != 0)) {
            return false;
        }

        while (x > num) {
            popOffDigit = x % TEN;
            num = num * TEN + popOffDigit;
            x /= TEN;
        }
        return x == num || x == num / 10;
    }
    public static void main(String[] args) {
        System.out.println(reverse(111));
        System.out.println(reverse(-123123));
        System.out.println(reverse(121));
        System.out.println(reverse(-121));
        System.out.println(reverse(10));
        System.out.println(reverse(0));
        System.out.println(reverse(-101));
        System.out.println(reverse(1001));

    }
}
