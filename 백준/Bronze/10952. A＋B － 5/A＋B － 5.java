import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = 0;
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a==0&&b==0) {
				break;
			}
			r=a+b;
			
			System.out.println(r);
			
		}
	}
}