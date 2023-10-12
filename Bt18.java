public class Bt18 {
        public static void main(String[] args) {
            int n = 20;
            double sum = 0.0; // Sử dụng double để lưu giá trị có dấu thập phân
    
            for (int i = 1; i <= n; i++) {
                sum += Math.pow(i, 1.0 / i); // Sử dụng Math.pow để tính lũy thừa cấp n và ép kiểu số thập phân
            }
    
            System.out.println("Giá trị của s là: " + sum);
        }
}
