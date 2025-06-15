class Solution {
    public long solution(long n) {
        
        // n의 양의 제곱근^2 한 값이 n과 같다면 (정확한 정수의 제곱이 맞다면)
        if(Math.pow((int)Math.sqrt(n), 2) == n) {
            // (x + 1)의 제곱한 값을 반환
            return (long)Math.pow(Math.sqrt(n) + 1, 2);
        }
        
        return -1;
    }
}