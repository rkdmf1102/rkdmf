import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		
		int a = 0;
		for(int i=0; i<9; i++) {
			a=sc.nextInt();
			list.add(a);
		}
		int max = Collections.max(list);
		System.out.println(max);
		
		for(int i=0; i<list.size(); i++) {
			if(max==list.get(i)) {
				System.out.println(i+1);
			}
		}
	}
}