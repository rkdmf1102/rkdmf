import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 1; //an-1
		int b = 1; //i
		int c = 0; //an
		
		while (true) {
			a += 6*b-6;
			c = a+6*b;
			b++;
			
			if(a<n&&n<=c) {
				break;
			}
		}
		if(n==1) {
			b=1;
		}
		System.out.println(b);
	}
}