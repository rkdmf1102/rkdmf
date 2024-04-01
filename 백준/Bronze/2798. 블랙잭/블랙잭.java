import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int aa = 0;

		List<Integer> a = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int q = sc.nextInt();
			a.add(q);
		}

	
		for (int j = 0; j < a.size(); j++) {
			for (int q = j + 1; q < a.size(); q++) {
				for (int k = q + 1; k < a.size(); k++) {
					
					int bb = a.get(j)+a.get(q)+a.get(k);
					if(aa < bb && bb <= m) {
						aa = bb;
					}
				}
			}
		}
		System.out.println(aa);
		
	}
}