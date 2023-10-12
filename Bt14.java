// Bài 14: Tính s = 1*4 + 2*5 + 3*6 +…+ n*(n + 3). Với n = 150
public class Bt14 {
    public static void main(String[] args) {
        int n = 150;
        int s = 0;

        for (int i = 1; i <= n; i++) {
            int term = i * (i + 3); // Tính giá trị của mỗi số trong dãy
            s += term; // Thêm số term vào tổng s
        }

        System.out.println("Tổng của dãy số là: " + s);
    }
}
