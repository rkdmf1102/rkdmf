import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		
		int n = sc.nextInt();
		int a = 0;
		for(int i=0; i<n; i++) {
			a=sc.nextInt();
			list.add(a);
		}
		int max = Collections.max(list);
		int min = Collections.min(list);
		System.out.println(min+" "+max);
	}
}