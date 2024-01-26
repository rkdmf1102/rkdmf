import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = sc.nextInt();
		
		String ss = String.valueOf(Integer.parseInt(s,n));
		
		
		System.out.println(Integer.parseInt(ss,10));
	}
}