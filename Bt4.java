// BT4: Cho độ dài của 3 đoạn thẳng. Kiểm tra chúng có tạo thành tam giác không.
// Nếu có hãy tính diện tích của tam giác đó. Giải sử a = 10, b = 5, c = 8

public class Bt4 {
    public static void main(String[] args) {
        double a = 10;
        double b = 5;
        double c = 8;

        if (isTriangle(a, b, c)) {
            double area = calculateTriangleArea(a, b, c);
            System.out.println("BA DOAN THANG a = " + a + ", b = " + b + ", c = " + c + " TAO THANH MOT TAM GIAC.");
            System.out.println("DIEN TICH CUA TAM GIAC LA: " + area);
        } else {
            System.out.println("Ba đoạn thẳng a = " + a + ", b = " + b + ", c = " + c + " KHÔNG TAO THANH MOT TAM GIAC.");
        }
    }

    public static boolean isTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public static double calculateTriangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
