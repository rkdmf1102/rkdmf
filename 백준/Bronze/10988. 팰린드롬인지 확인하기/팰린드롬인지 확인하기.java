import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		int r = 0;

		if (st.length() == 1) {
			r = 1;
		} else {
			for (int i = 0; i < st.length() / 2; i++) {
				if (st.charAt(i) == st.charAt(st.length() - i - 1)) {
					r = 1;

				} else {
					r = 0;
					break;
				}
			}
		}
		System.out.println(r);
	}
}