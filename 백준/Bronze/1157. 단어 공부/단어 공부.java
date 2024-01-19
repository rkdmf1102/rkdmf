import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] s = sc.next().toUpperCase().split("");// 문자 분리
		List<String> list = new ArrayList<>(Arrays.asList(s));// 리스트로 바꿈
		LinkedHashSet<String> slist = new LinkedHashSet<>(list);// 중복제거 완료
		List<String> llist = new ArrayList<>(slist);// 다시 리스트 변환
		List<Integer> ilist = new ArrayList<>();// 각 문자 몇개인지 리스트
		List<String> r = new ArrayList<>();
		for (int i = 0; i < slist.size(); i++) {
			int c = 0;
			for (int j = 0; j < list.size(); j++) {
				if (llist.get(i).equals(list.get(j))) {// 만약 중복을 제거한 리스트의 값이 원래 리스트의 값과 같다면
					c += 1;// c에 +1씩 해주고
				}
			}
			ilist.add(c);// 그것을 리스트에 넣음
		}
		int max = Collections.max(ilist);
		for (int i = 0; i < ilist.size(); i++) {
			if (ilist.get(i) == max) {// 만약에 문자의 개수가 리스트의 최댓값과 같다면
				r.add(llist.get(i));// 이 리스트에 값을 넣어
			}
		}
		if (r.size() > 1) {// 만약에 r의 사이즈가 2이상일 경우
			System.out.println("?");
		} else {// 만약에 r의 사이즈가 1일경우
			System.out.println(r.get(0));
		}
	}
}