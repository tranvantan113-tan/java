//Bài 1: Cho n là số nguyên dương, phân tích n ra thừa số nguyên tố. Với n = 250


public class Bt1 {
    public static void main(String[] args) {
        int n = 250;
//	System.out.println("Phân tích " +n+ " thừa nguyên tố");
	System.out.println("So thua cua nguyen to = 250 la: ");
	
	int prime = 2;
	
	while (n > 1) {
	int count = 0;
	 
	while (n % prime == 0) {
	n /= prime;
	count++;
	}
	if (count > 0) {
		System.out.println(prime + "^" + count);
	}
	prime++;
	}
}
}
