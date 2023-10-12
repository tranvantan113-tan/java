// Bài 15: Tính 𝑠 = 1 + 2
// 2 + 3
// 2 + ⋯ + 𝑛
// 2
// . Với n=70
public class Bt15 {
    public static void main(String[] args){
        int n = 70;
        long sum = 0;
        for(int i = 1; i <= n; i++ ){
            sum += Math.pow(i, 2);
        }
        System.out.println("Gia tri cua S la:" + sum);
    }
}
