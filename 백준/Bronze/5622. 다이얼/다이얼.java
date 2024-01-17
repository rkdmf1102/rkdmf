import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int a = 0;
		int sum1 = 0;
		
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch=='A'||ch=='B'||ch=='C') {
				a = 2;
			}else if(ch=='D'||ch=='E'||ch=='F') {
				a = 3;
			}else if(ch=='G'||ch=='H'||ch=='I') {
				a = 4;
			}else if(ch=='J'||ch=='K'||ch=='L') {
				a = 5;
			}else if(ch=='M'||ch=='N'||ch=='O') {
				a = 6;
			}else if(ch=='P'||ch=='Q'||ch=='R'||ch=='S') {
				a = 7;
			}else if(ch=='T'||ch=='U'||ch=='V') {
				a = 8;
			}else if(ch=='W'||ch=='X'||ch=='Y'||ch=='Z') {
				a = 9;
			}
			
			sum1 += a;
		}
		
		System.out.println(sum1+s.length());
	}	
}