// Bài 6: Cho tọa độ hai điểm trên mặt phẳng. Tính khoảng cách giữa hai điểm này. Ví
// dụ A(3; 7), B(-5; -8)

public class Bt6 {
    public static void main(String[] args) {
        double x1 = 3;
        double y1 = 7;
        double x2 = -5;
        double y2 = -8;

        double distance = calculateDistance(x1, y1, x2, y2);

        System.out.println("Khoang cach giua hai diem A v B la: " + distance);
    }

    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
