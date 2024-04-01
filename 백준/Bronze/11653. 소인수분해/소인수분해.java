import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = n;

		List<Integer> list = new ArrayList<>();
		
		out: while (true) {
			if(n==1) {
				break out;
			}
			
			for (int i = 2; i <= a; i++) {
				if(a/i==1) {
					list.add(a);
					break out;
				}
				if (a % i == 0) {
					a = a / i;
					list.add(i);
					continue out;
				}
			}
		}
		
		for(int i : list) {
			System.out.println(i);
		}
	}
}