import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] s = new String[5];
		String ssss = "";
		int max = 0;
		int difference = 0;

		for (int i = 0; i < s.length; i++) {
			String ss = sc.nextLine();
			s[i] = ss;
			max = Math.max(max, ss.length());
		}

		for (int i = 0; i < s.length; i++) {

			String sss = s[i];
			if (sss.length() < max) {
				difference = max - sss.length();
				for (int k = 0; k < difference; k++) {
					sss += " ";
				}
				s[i] = sss;
			}
		}
		for(int i=0; i<max; i++) {
			for(String str:s) {
				ssss += str.charAt(i);
			}
		}
		
		ssss=ssss.replace(" ", "");
		
		System.out.println(ssss);
	}
}