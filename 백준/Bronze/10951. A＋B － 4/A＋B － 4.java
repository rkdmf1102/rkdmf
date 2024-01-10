import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = 0;
		while(sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			r=a+b;
			
			System.out.println(r);
			
		}
	}
}