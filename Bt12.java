// Bài 12: Tính tổng các chữ số chẵn (s1) và tổng các chữ số lẽ (s2) từ 1…n. Với n =
// 751
public class Bt12 {
    public static void main(String[] args) {
        int n = 751;
        int s1 = 0; // Tổng các chữ số chẵn
        int s2 = 0; // Tổng các chữ số lẻ

        for (int i = 1; i <= n; i++) {
            int number = i;
            while (number > 0) {
                int digit = number % 10;
                if (digit % 2 == 0) {
                    s1 += digit; // Thêm chữ số chẵn vào tổng s1
                } else {
                    s2 += digit; // Thêm chữ số lẻ vào tổng s2
                }
                number /= 10;
            }
        }

        System.out.println("TONG CAC CHU SO CHAN TU 1 DEN " + n + " LA: " + s1);
        System.out.println("TONG CAC CHU SO LE TU 1 DEN" + n + " LA: " + s2);
    }
}
