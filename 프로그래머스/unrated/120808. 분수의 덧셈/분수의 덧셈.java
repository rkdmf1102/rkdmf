class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int a = (numer1 * denom2) + (denom1 * numer2);
        int b = denom1 * denom2;
        
        int num = 1;
        for(int i=1; i<=b; i++) {
            if(b%i==0 && a%i==0) {
            num=i;
            }
        }
        int n = a/num;
        int d = b/num;
        
        int[] answer = {n,d};
        
        return answer;
    }
}