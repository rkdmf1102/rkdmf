import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int c = 0;
        
        LinkedHashSet<Integer> a = new LinkedHashSet<>();
        for (int i = 0; i < array.length; i++){
            a.add(array[i]);    
        }
        
        List<Integer> alist = new ArrayList<>(a);
        
        List<Integer> blist = new ArrayList<>();
         for (int i = 0; i < alist.size(); i++) {
            int n = 0;
            for (int j = 0; j < array.length; j++) {
                if (alist.get(i).equals(array[j])) {
                    n++;
                }
            }
            blist.add(n);
        }
        for (int i = 0; i < blist.size(); i++) {
			if (blist.get(i).equals(Collections.max(blist))) {
				c++;
				
				if (c == 1) {
					answer = alist.get(i);
				} else if (c > 1) {
					answer = -1;
				}
			}
		}
        
        return answer;
    }
}