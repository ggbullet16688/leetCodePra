/**
    Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

https://leetcode.com/problems/reverse-integer

**/

public class june21 {
    public static int reverse(int x) {
        final int TEN = 10;
        final int ZERO = 0;

        int MAX = Integer.MAX_VALUE;
        int MIN = Integer.MIN_VALUE;
        final int ERROR_CODE = 0;

        int popOffDigit;
        int num = ZERO;

        while (x != 0) {
            popOffDigit = x % TEN;
            x = x / TEN;

            if (num > MAX / TEN || (num == MAX / TEN && popOffDigit > 7)) {
                return ERROR_CODE;
            }

            if (num < MIN / TEN || (num == MIN / TEN && popOffDigit < -8)) {
                return ERROR_CODE;
            }

            num = num * TEN + popOffDigit;

        }

        return num;

    }
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
        System.out.println(reverse(-123123));
        System.out.println(reverse(22446678));
        System.out.println(reverse(-10));
        System.out.println(reverse(120));
        System.out.println(reverse(0));
    }
}
