import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        for (int i=0; i<array.length/2+1; i++) {
            answer=array[i];
        }
        
        return answer;
    }
}