// Bài 8: Trong không gian 3 chiều, cho 3 điểm A, B, C tạo thành mặt phẳng (P), kiểm
// tra xem điểm D có thuộc mặt phẳng (P) hay không. Biết A(1; 3; -2), B(4; - 1; 3),
// C(2; 4; -5) và D(1; 2; 1)
public class Bt8 {
    public static void main(String[] args) {
        // Tọa độ điểm A
        double ax = 1;
        double ay = 3;
        double az = -2;

        // Tọa độ điểm B
        double bx = 4;
        double by = -1;
        double bz = 3;

        // Tọa độ điểm C
        double cx = 2;
        double cy = 4;
        double cz = -5;

        // Tạo phương trình mặt phẳng từ A, B, và C
        double A = (by - ay) * (cz - az) - (bz - az) * (cy - ay);
        double B = (bz - az) * (cx - ax) - (bx - ax) * (cz - az);
        double C = (bx - ax) * (cy - ay) - (by - ay) * (cx - ax);
        double D = -(A * ax + B * ay + C * az);

        // Tọa độ điểm D
        double dx = 1;
        double dy = 2;
        double dz = 1;
         // Kiểm tra xem điểm D có thuộc mặt phẳng không
         if (A * dx + B * dy + C * dz + D == 0) {
            System.out.println("DIEM D(" + dx + ", " + dy + ", " + dz + ") THUOC MAT PHANG (P) TAO BOI A, B, và C.");
        } else {
            System.out.println("DIEM D(" + dx + ", " + dy + ", " + dz + ") kKHONG THUOC MAT PHANG (P)TAO BOI A, B, và C.");
        }
    }
}
