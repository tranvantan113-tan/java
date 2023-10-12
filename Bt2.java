// Bài 2: Cho n là số nguyên dương, kiểm tra xem n có phải là số nguyên tố không. Với
// n = 1789

public class Bt2 {
    public static void main(String[] args){
        int n = 1789;
        boolean isPrime = isPrime(n);
        if(isPrime){
            System.out.println(n + " La So Nguyen To.");
        }else{
            System.out.println(n + " Khong Phai La So Nguyem To");
        }
    }
    public static boolean isPrime(int n){
            if(n <= 1){
                return false;
            }
            if (n <= 3) {
                return true;
            }
            if (n % 2 == 0 || n % 3 == 0) {
                return false;
            }
            for (int i = 5; i * i <= n; i += 6) {
                if (n % i == 0 || n % (i + 2) == 0) {
                    return false;
                }
        }
        return true; 
        }
    }
