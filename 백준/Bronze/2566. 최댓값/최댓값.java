import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[9][9];
		Integer[] aa = new Integer[81];
		int b=0;
		int c=0;
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				aa[a[i].length*i+j] = a[i][j];
			}
		}
		
		List<int[]> list = new ArrayList<int[]>(Arrays.asList(a));
		List<Integer> list2 = new ArrayList<>(Arrays.asList(aa));
		
		int n = Collections.max(list2);
		
		for(int i=1; i<= 9; i++) {
			for(int j=1; j<=9; j++) {
				if(list.get(i-1)[j-1]==n) {
					b=i;
					c=j;
					break;
				}
			}
		}
		System.out.println(n+"\n"+b+" "+c);
	}
}