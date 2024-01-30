import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 2; //an-1
		int b = 3; //i
		int c = 2; //an
		
		int q = 0; //분자
		int w = 0; //분모
		
		while (true) {
			a = c;
			c = a+b-1;
			
			if(a<=n&&n<c) {
				break;
			}
			b++;
		}
		if(b%2==0) {
			q = c-n;
			w = b-c+n;
		}
		else if(b%2==1) {
			q = b-c+n;
			w = c-n;
		}
		
		if(n==1) {
			q=1;
			w=1;
		}
		
		System.out.println(q+"/"+w);
	}
}