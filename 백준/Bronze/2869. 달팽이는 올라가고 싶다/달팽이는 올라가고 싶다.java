import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int v = sc.nextInt();
		int n = 0;
		
		n = (v-a)/(a-b);
		
		if(v-a==0||v-a==a-b) {
			System.out.println(1);
		} else if(v-a>a-b&&(v-a)%(a-b)==0) {
			System.out.println(n+1);
		} else if(v-a<a-b) {
			System.out.println(2);
		} else if((v-a)%(a-b)>0) {
			System.out.println(n+2);
		}
	}
}