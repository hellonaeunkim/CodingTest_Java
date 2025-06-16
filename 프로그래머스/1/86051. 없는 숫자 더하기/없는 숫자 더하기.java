class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        for(int i = 1; i < 10; i++) {
            // i가 numbers 배열에 존재하는지를 체크하기 위해 boolean 타입의 변수 선언
            boolean exists = false;
            
            // numbers 배열을 돌면서 현재 i가 존재하는지 확인
            for(int j = 0; j < numbers.length; j++) {
                if(i == numbers[j]) {
                    // i가 배열에 존재하면 true로 바꿈
                    exists = true;
                    break; // 더 이상 확인할 필요 없으므로 반복문 종료
                }
            }
            // 만약 i가 numbers 배열에 없었다면, answer에 i를 더함
            if(!exists) {
                answer += i;
            }
        }
        
        return answer;
    }
}