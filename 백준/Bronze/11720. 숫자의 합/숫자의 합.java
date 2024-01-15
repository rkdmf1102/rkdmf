import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String a = sc.next();
		int b = 0;
		int c = 0;
		
		for(int i=0; i<n; i++) {
			c = a.charAt(i);
			b += c-'0';
			
		}
		System.out.println(b);
	}
}
