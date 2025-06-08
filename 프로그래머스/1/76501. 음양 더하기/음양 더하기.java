class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        // signs가 false인 경우, signs 인덱스와 같은 absolutes 배열 값을 뺌
        for(int i = 0; i < absolutes.length; i++) {
            if(signs[i] == false) {
                answer -= absolutes[i];
            } else {
                answer += absolutes[i];
            }
        }
        return answer;
    }
}