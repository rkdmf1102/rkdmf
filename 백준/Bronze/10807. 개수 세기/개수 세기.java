import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			list.add(a);
		}
		int v = sc.nextInt();
		
		int b = Collections.frequency(list, v);
		System.out.println(b);
	}
}