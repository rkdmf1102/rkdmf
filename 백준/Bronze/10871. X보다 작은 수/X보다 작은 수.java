import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();

		int a=0;
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<n; i++) {
			a = sc.nextInt();
			list.add(a);
		}
		for(int b : list) {
			if(b<x) {
				System.out.println(b);
			}
		}
	}
}