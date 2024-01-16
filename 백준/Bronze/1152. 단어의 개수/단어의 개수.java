import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String aa = sc.nextLine().strip();
		String[] a = aa.strip().split(" ");
		
		if(aa.isEmpty()) {
			System.out.println(0);
		}else {
			System.out.println(a.length);
		}
	}
}