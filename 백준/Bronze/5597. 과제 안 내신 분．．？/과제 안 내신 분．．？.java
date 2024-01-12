import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();

		for(int i=0; i<28; i++) {
			int a = sc.nextInt();
			list.add(a);
		}	
		
		for(int j=1; j<=30; j++) {
			if(list.indexOf(j)==-1) {
				System.out.println(j);
			}
		}
	}
}