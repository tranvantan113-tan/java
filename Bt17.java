// Bài 17: Tính 𝑠 = 1 −
// 1
// 2
// +
// 1
// 3
// −
// 1
// 4
// + ⋯ + (−1)
// 𝑛−1
// 1
// 𝑛
// , Với n = 200

public class Bt17 {
    public static void main(String[] args){
        int n = 200;
        double sum = 0.0;
            for(int i = 1; i <= n; i++) {
                if(i % 2 == 0){
                    sum -= 1.0 / i;
                }else{
                    sum += 1.0 / i;
                }
            }   
             System.out.println("Giá trị của s là: " + sum);
}
}

