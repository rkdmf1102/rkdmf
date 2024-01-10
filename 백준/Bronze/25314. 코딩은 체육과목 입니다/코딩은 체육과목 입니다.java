import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		String l = "long ";
		
		for(int i=0; i<n; i++) {
			if(n%4==0) {
				a = n/4;
			}
		}
		System.out.print(l.repeat(a)+"int");
		
	}
}