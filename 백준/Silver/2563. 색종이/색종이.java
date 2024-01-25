import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] s = new int[100][100];
		
		for (int i = 0; i < n; i++) {
			int nn = sc.nextInt();
			int mm = sc.nextInt();
			for (int j = nn; j < nn+10; j++) {
				for (int k = mm; k < mm+10; k++) {
					s[j][k] = 1;
				}
			}
		}
		int r = 0;
		for(int[] a: s) {
			for(int aa: a) {
				if(aa == 1) {
					r++;
				}
			}
		}
		System.out.println(r);
	}
}