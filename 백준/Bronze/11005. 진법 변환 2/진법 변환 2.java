import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s ="";
		
		List<Integer>list= new ArrayList<>();
		while(a!=0) {
			list.add(a%b);
			a/=b;
		}
		
		for(int i=list.size()-1; i>=0; i--) {
			if(list.get(i)>=10) {
				char n = (char)(list.get(i)+55);
				s += n;
			}else {
				s+=list.get(i);
			}
		}
		System.out.println(s);
	}
}