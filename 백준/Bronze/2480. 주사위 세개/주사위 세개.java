import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		list.add(a);
		list.add(b);
		list.add(c);
		
		Collections.sort(list);
		
		if (a==b && b==c) {
			System.out.println(10000+(a*1000));
		} else if ((a==b&&b!=c)||(a==c&&c!=b)||(b==c&&c!=a)) {
			System.out.println(1000+(list.get(1)*100));
		} else if (a!=b&&b!=c&&c!=a) {
			System.out.println(list.get(2)*100);
		}
	}
}