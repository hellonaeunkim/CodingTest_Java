class Solution {
    public long solution(int n) {
        
         // dp[i]: i번째 칸에 도달하는 경우의 수
        long[] dp = new long[n + 2];
        
        // 1칸에 도달하는 경우의 수는 1, 2칸은 2
        dp[0] = 0; // 사용하지 않음 (예비공간)
        dp[1] = 1;
        dp[2] = 2;
        
        // 3번째 칸부터 n번째 칸까지 경우의 수 계산
        for (int i = 3; i <= n; i++) {
            // n=2000이면 long 의 범위를 벗어나게 되므로 모듈러 연산
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
        }
        
        return dp[n];
    }
}