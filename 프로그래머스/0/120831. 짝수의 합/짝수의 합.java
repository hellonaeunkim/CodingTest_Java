class Solution {
    
    int answer = 0;
    
    public int solution(int n) {
        if (n > 0 && n <= 1000) {
            for(int i = 2; i <= n; i+=2) {
                if (i % 2 == 0) {
                    answer = answer + i;
                }
            }
        }
        
        return answer;
    }
}