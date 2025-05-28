class Solution {
    int count = 0; // 타겟 숫자를 만들 수 있는 경우의 수를 저장하는 전역 변수

    public int solution(int[] numbers, int target) {
        int answer = 0;

        // DFS 탐색 시작: 초기 인덱스 0, 결과값 0부터 시작
        dfs(numbers, 0, target, 0);

        answer = count; // DFS 결과로 나온 경우의 수를 반환값에 저장
        return answer;
    }

    // DFS 메서드 정의
    public void dfs(int[] numbers, int depth, int target, int result) {
        // 종료 조건: 모든 숫자를 다 사용했을 경우
        if (depth == numbers.length) {
            // 현재까지 만든 합이 타겟과 같다면 count 증가
            if (target == result) {
                count++;
            }
            return;
        }

        // 현재 숫자를 양수로 사용
        int plus = result + numbers[depth];
        // 현재 숫자를 음수로 사용
        int minus = result - numbers[depth];

        // 다음 깊이로 재귀 호출 (양수 선택한 경우)
        dfs(numbers, depth + 1, target, plus);

        // 다음 깊이로 재귀 호출 (음수 선택한 경우)
        dfs(numbers, depth + 1, target, minus);
    }
}
