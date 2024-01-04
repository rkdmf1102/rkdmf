class Solution {
    public int[] solution(int money) {
       
        int coffee;
        int Changes;
        
        coffee = money /5500;
        Changes = money % 5500;
         int[] answer = {coffee,Changes};
        return answer;
    }
}