import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i<10; i++) {
			int a = sc.nextInt();
			int n = a%42;
			list.add(n);
		}
		
		Set<Integer> slist = new HashSet<Integer>(list);
		List<Integer> nlist = new ArrayList<Integer>(slist);
		
		System.out.println(nlist.size());
		
	}
}