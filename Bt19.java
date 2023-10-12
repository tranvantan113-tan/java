public class Bt19{
        public static void main(String[] args) {
            int n = 30;
            double sum = 0.0; // Sử dụng double để lưu giá trị có dấu thập phân
    
            for (int i = 1; i <= n; i++) {
                double term = (double) i / Math.pow(2, i); // Tính giá trị của từng phần tử
                sum += term;
            }
            System.out.println("Giá trị của s là: " + sum);
        }
}
