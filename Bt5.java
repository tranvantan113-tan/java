// Bài 5: Cho độ dài 3 cạnh của một tam giác. Kiểm tra xem tam giác đó là tam giác
// đều, vuông cân, cân, hay tam giác thường. a = 8, b = 12, c = 12

import java.util.Arrays;

public class Bt5 {
    public static void main(String[] args) {
        double a = 8;
        double b = 12;
        double c = 12;
        if (isEquilateralTriangle(a, b, c)) {
            System.out.println("Tam giác đều");
        } else if (isIsoscelesTriangle(a, b, c)) {
            if (isRightTriangle(a, b, c)) {
                System.out.println("Tam giác vuông cân");
            } else {
                System.out.println("Tam giác cân");
            }
        } else if (isRightTriangle(a, b, c)) {
            System.out.println("Tam giác vuông");
        } else {
            System.out.println("Tam giác thường");
        }
    }
    public static boolean isEquilateralTriangle(double a, double b, double c) {
        return a == b && b == c;
    }
    public static boolean isIsoscelesTriangle(double a, double b, double c) {
        return a == b || b == c || a == c;
    }
    public static boolean isRightTriangle(double a, double b, double c) {
        double[] sides = { a, b, c };
        Arrays.sort(sides);
        return Math.pow(sides[0], 2) + Math.pow(sides[1], 2) == Math.pow(sides[2], 2);
    }
}
