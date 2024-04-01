import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int[] a = new int[3];
		
		for(int i=0; i<3; i++) {
			a[i] = sc.nextInt();
		}
		
		int nn=0;
		
		for(int i:a) {
			nn += i;
		}
		
		if(nn==180) {
			if(a[0]==a[1]&&a[0]!=a[2]||a[0]==a[2]&&a[0]!=a[1]||a[1]==a[2]&&a[1]!=a[0]) {
				System.out.println("Isosceles");
			} else if(a[0]!=a[1]&&a[0]!=a[2]&&a[1]!=a[2]) {
				System.out.println("Scalene");
			} else
				System.out.println("Equilateral");
		} else {
			System.out.println("Error");
		}
	}
}