import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		String[][] a = new String[n][m];
		String[][] b = new String[n][m];
		int[][] r = new int[n][m];
		int rr=0;
		
		for(int i=0; i<n; i++) {
			a[i] = sc.nextLine().split(" ");
		}
		
		for(int i=0; i<n; i++) {
			b[i] = sc.nextLine().split(" ");
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				rr = Integer.parseInt(a[i][j]) + Integer.parseInt(b[i][j]);
				r[i][j] = rr;
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print(r[i][j]+" ");				
			}
			System.out.println("");
		}
	}
}