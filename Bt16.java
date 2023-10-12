/*Tính 𝑠 = 1 + 1/2+1/3+ ⋯ +1/𝑛
. Với n = 100*/


public class Bt16 {
    public static void main(String[] args){
        int n = 100;
        double sum = 0.0;
        for(int i = 1; i <= n; i++){
            sum +=1.0 / i;
        }
        System.out.println("Gia tri cua S la:" + sum);
    }
}
