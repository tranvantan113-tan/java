public class Bt20 {
    public static void main(String[] args) {
        int n = 10;
        double sum = 0.0; // Sử dụng double để lưu giá trị có dấu thập phân

        for (int i = 1; i <= n; i++) {
            double term = 1.0 / factorial(i); // Tính giá trị của từng mục
            sum += term;
        }

        System.out.println("Giá trị của s là: " + sum);
    }

    // Hàm tính giai thừa
    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
