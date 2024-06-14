class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int n = 0;
        
        for(int i = 0; i <= num_list.length-1; i++) {
        	answer[i] = num_list[num_list.length-1-n];
        	n++;
        }
        
        return answer;
    }
}