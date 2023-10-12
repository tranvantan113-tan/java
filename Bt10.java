// Bài 10: Tính và hiển thị dãy số Fibonacci. Hiển thị đến phần tử thứ 100 trong dãy số

import java.math.BigInteger;

public class Bt10 {
    public static void main(String[] args) {
        int n = 100; // Số phần tử cần tính trong dãy Fibonacci
        BigInteger[] fibonacci = new BigInteger[n + 1];

        // Khởi tạo dãy Fibonacci với F(0) và F(1)
        fibonacci[0] = BigInteger.ZERO;
        fibonacci[1] = BigInteger.ONE;

        // Tính dãy Fibonacci từ F(2) đến F(n)
        for (int i = 2; i <= n; i++) {
            fibonacci[i] = fibonacci[i - 1].add(fibonacci[i - 2]);
        }

        // Hiển thị dãy Fibonacci
        System.out.println("Dãy số Fibonacci đến phần tử thứ " + n + ":");
        for (int i = 0; i <= n; i++) {
            System.out.println("F(" + i + ") = " + fibonacci[i]);
        }
    }
}
