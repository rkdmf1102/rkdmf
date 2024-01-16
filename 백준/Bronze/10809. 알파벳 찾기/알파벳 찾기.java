import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int[] a = new int[26];
		
		for(int i=0; i<a.length; i++) {
			a[i] = -1;
		}
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			
			if(a[c-'a']==-1) {
				a[c-'a']=i;
			}
		}
		for(int aa:a) {
			System.out.print(aa+" ");
		}
	}
}