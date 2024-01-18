import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[] {1,1,2,2,2,8};
		
		for(int i=0; i<a.length; i++) {
			int num = sc.nextInt();
			int b = a[i]-num;
			System.out.println(b);
		}
	}	
}