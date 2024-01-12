import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = i+1;
		}
		for(int i=0; i<m; i++) {
			int ii = sc.nextInt();
			int jj = sc.nextInt();
			for(int j=0; j<((int)(jj-ii+1)/2); j++) {
				int tmp = a[ii+j-1];
				a[ii+j-1] = a[jj-j-1];
				a[jj-j-1] = tmp;
				
			}
			
		}
		for(int b : a) {
			System.out.print(b+" ");
		}
	}
}