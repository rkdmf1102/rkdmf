import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = b+c;
		int n = d/60;
		
		if (d<60) {
			System.out.println(a+" "+d);
		} else {
			if(a+n>=24) {
			System.out.println((a+n-24)+" "+d%60);
			} else {
				System.out.println((a+n)+" "+d%60);
			}
		}
	}	
}