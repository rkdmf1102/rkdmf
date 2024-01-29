import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] a = {25, 10, 5, 1};
		
		for(int i=0; i<t; i++) {
			int c = sc.nextInt();
			int q = 0;
			int d = 0;
			int n = 0;
			int p = 0;
			
			q = c/a[0];
			d = c%a[0]/a[1];
			n = c%a[0]%a[1]/a[2];
			p = c%a[0]%a[1]%a[2]/a[3];
			System.out.println(q+" "+d+" "+n+" "+p);
		}
	}
}