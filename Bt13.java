// Bài 13: Tính s = 1 + 3 + 5 + 7 +…+ (2n+1). Với n = 200.
public class Bt13 {
    public static void main(String[] args) {
        int n = 200;
        int s = 0;

        for (int i = 0; i <= n; i++) {
            int term = 2 * i + 1; // Tính giá trị của mỗi số trong dãy
            s += term; // Thêm số term vào tổng s
        }

        System.out.println("Tổng của dãy số là: " + s);
    }  
}
