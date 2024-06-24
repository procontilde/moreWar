package org.example;

/*
The Fibonacci numbers are the numbers in the following integer sequence (Fn): 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, ... such as F(n) = F(n-1) + F(n-2) with F(0) = 0 and F(1) = 1.
		Given a number, say prod (for product), we search two Fibonacci numbers F(n) and F(n+1) verifying F(n) * F(n+1) = prod.
		Your function productFib takes an integer (prod) and returns an array: [F(n), F(n+1), true] or {F(n), F(n+1), 1} or (F(n), F(n+1), True) depending on the language if F(n) * F(n+1) = prod.
		If you don't find two consecutive F(n) verifying F(n) * F(n+1) = prod you will return [F(n), F(n+1), false] or {F(n), F(n+1), 0} or (F(n), F(n+1), False) F(n) being the smallest one such as F(n) * F(n+1) > prod.
		Some Examples of Return: (depend on the language)

productFib(714) # should return (21, 34, true),  # since F(8) = 21, F(9) = 34 and 714 = 21 * 34
productFib(800) # should return (34, 55, false), # since F(8) = 21, F(9) = 34, F(10) = 55 and 21 * 34 < 800 < 34 * 55
-----
productFib(714) # should return [21, 34, true],
productFib(800) # should return [34, 55, false],
-----
productFib(714) # should return {21, 34, 1},
productFib(800) # should return {34, 55, 0},
-----
productFib(714) # should return {21, 34, true},
productFib(800) # should return {34, 55, false},
 */

public class Fibonacci {
        public static long[] productFib(long prod) {
            long[] result = new long[3];
            long fib1 = 0;
            long fib2 = 1;

            while (fib1 * fib2 < prod) {
                long temp = fib2;
                fib2 = fib1 + fib2;
                fib1 = temp;
            }

            result[0] = fib1;
            result[1] = fib2;
            result[2] = (fib1 * fib2 == prod) ? 1 : 0;

            return result;
        }

        public static void main(String[] args) {
            // Ejemplos de uso
            long prod1 = 714;
            long prod2 = 800;

            long[] result1 = productFib(prod1);
            long[] result2 = productFib(prod2);

            System.out.println("Para prod = " + prod1 + ", resultado: [" + result1[0] + ", " + result1[1] + ", " + result1[2] + "]");
            System.out.println("Para prod = " + prod2 + ", resultado: [" + result2[0] + ", " + result2[1] + ", " + result2[2] + "]");
        }
}
