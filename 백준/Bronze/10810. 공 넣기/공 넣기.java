import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] a = new int[n];
		
		for(int i=0; i<m; i++) {
			int ii = sc.nextInt();
			int jj = sc.nextInt();
			int kk = sc.nextInt();
			for(int j=ii-1; j<jj; j++) {
				a[j] = kk;
			}
		}
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}