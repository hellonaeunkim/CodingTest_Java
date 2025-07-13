class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        // 약수의 개수 구하기
        for(int i = left; i <= right; i++) {
            int count = 0; // 약수의 개수를 저장할 변수
            
            // 1부터 i까지 반복하면서 약수의 개수 구하기
            for (int j = 1; j <= i; j++) {
                if ( i % j == 0) {
                    count++;
                }
            }
            
            // 약수의 개수가 짝수면 더하고, 홀수면 빼기
            answer = count % 2 == 0 ? answer + i : answer - i;
        }
        
        return answer;
    }
}