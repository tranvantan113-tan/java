// Bài 7: Trong không gian 2 chiều, cho một đường tròn tâm O bán kính R, kiểm tra
// xem điểm I có thuộc đường tròng này không. Với O(3; 5), R = 7, I(1,7)
public class Bt7 {
    public static void main(String[] args){
        double oX = 3;
        double oY = 5;
        double r = 7;
        double iX = 1;
        double iY = 7;

        double distance = calculateDistance(oX, oY, iX, iY);
        if (distance <= r) {
            System.out.println("Diêm I(" + iX + ", " + iY + ") thuoc duong tron tam O(" + oX + ", " + oY + ")VA BAN KINH R = " + r);
        } else {
            System.out.println("DIEM I(" + iX + ", " + iY + ") KHONG THUOC DUONG TRON TAM O(" + oX + ", " + oY + ") và bán kính R = " + r);
        }
    }
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
