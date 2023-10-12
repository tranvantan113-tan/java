// Bài 9: Cho một số nguyên dương n là số Khw điện tiêu thụ trong tháng. Tính số tiền
// phải trả biết rằng: 100 khw đầu tiên đơn giá 1550đ, 100 Khw tiếp theo đơn giá 2050đ,
// 100khw tiếp theo đơn giá 3200đ, còn lại đơn giá 4000đ. Chố biết n = 783khw
public class Bt9 {
    public static void main(String[] args) {
        int n = 783; // Số khw điện tiêu thụ

        double totalBill = calculateElectricBill(n);

        System.out.println("SO TIEN PHAI TRA CHO " + n + " khw DIEN LA: " + totalBill + "đ");
    }
    public static double calculateElectricBill(int n) {
        double totalBill = 0.0;

        if (n <= 100) {
            totalBill = n * 1550;
        } else if (n <= 200) {
            totalBill = 100 * 1550 + (n - 100) * 2050;
        } else if (n <= 300) {
            totalBill = 100 * 1550 + 100 * 2050 + (n - 200) * 3200;
        } else {
            totalBill = 100 * 1550 + 100 * 2050 + 100 * 3200 + (n - 300) * 4000;
        }
        return totalBill;
    }
}
