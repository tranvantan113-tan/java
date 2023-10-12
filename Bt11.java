// Bài 11: Tính giá trị của
// √𝑥 + √𝑥 + √𝑥 + √𝑥 + ⋯ + √𝑥. Số lượng phép trong căn là
// n = 20, x = 3;

public class Bt11 {
    public static void main(String[] args) {
        int n = 20; // Số lượng phép cộng
        double x = 3; // Giá trị của x
        double result = 0;

        for (int i = 0; i < n; i++) {
            result += Math.sqrt(x); // Thêm √x vào tổng
        }

        System.out.println("GIA TRI CUA BIEU THUC LA: " + result);
    }
}
