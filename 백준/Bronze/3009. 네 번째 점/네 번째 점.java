import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
		int[] b = new int[3];

		for (int i = 0; i < 3; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			a[i] = x;
			b[i] = y;
		}

		int x = 0;
		int y = 0;

		if(a[0]==a[1]) 
			x=a[2];
		else if(a[0]==a[2])
			x=a[1];
		else
			x=a[0];
		
		if(b[0]==b[1]) 
			y=b[2];
		else if(b[0]==b[2])
			y=b[1];
		else
			y=b[0];
		
		

		System.out.println(x + " " + y);
	}
}