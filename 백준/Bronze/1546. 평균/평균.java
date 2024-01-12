import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		
		int n = sc.nextInt();
		double sum = 0;
		
		
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			list.add(a);
			sum += a;
			
		}
		int aa = Collections.max(list);
		System.out.println(sum/aa*100/n);
	}
}