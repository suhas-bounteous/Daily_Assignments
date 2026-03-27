package com.oops.learning;

public class MathUtils {

    private MathUtils() {
        // Prevent object creation
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }
}
