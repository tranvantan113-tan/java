// /Bài 3: Cho 2 số nguyên dương n, m, tìm ước chung lớn nhất (n, m) và bội chung nhỏ
// nhất (n, m). Với n = 18, m = 152.
public class Bt3 {
    public static void main(String[] args){
            int n = 18;
            int m = 152;
        
            int gcd = findGCD(n, m);
            int lcm = (n * m) / gcd;
            
            System.out.println("Uoc chung lon nhat cua " + n + " và " + m + " là " + gcd);
            System.out.println("boi chung nho nhat cua " + n + " và " + m + " là " + lcm);
        }
        public static int findGCD(int a, int b){
            if(b == 0){
                return a;
            }
            return findGCD(b, a % b);
        }
        }
