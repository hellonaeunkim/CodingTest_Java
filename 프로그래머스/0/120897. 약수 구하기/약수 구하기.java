class Solution {
    public int[] solution(int n) {
        // 약수 개수 저장할 변수
        int count = 0;
        
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                count++;
            }
        }
        
        // 약수 개수만큼 배열을 생성
        int[] divisors = new int[count];
        
        int index = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) { // i가 약수라면
                divisors[index++] = i; // 배열에 저장하고 index 증가
            }
        }
        
        return divisors;
    }
}