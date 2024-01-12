import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] a = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i]=i+1;
		}
		for(int i=0; i<m; i++) {
			int ii = sc.nextInt();
			int jj = sc.nextInt();
			int t = a[ii-1];
			a[ii-1] = a[jj-1];
			a[jj-1] = t;
			
		}
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}