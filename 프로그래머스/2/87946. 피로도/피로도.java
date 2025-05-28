class Solution {

    // DFS (백트래킹) 메서드: 현재 피로도 k, 던전 정보 dungeons
    int dfs(int k, int[][] dungeons) {
        int cnt = 0; // 현재 상태에서 탐험할 수 있는 최대 던전 수

        // 모든 던전에 대해 반복
        for (int[] d : dungeons) {
            int a = d[0], b = d[1]; // a: 최소 필요 피로도, b: 소모 피로도

            // 현재 피로도로 이 던전에 들어갈 수 있는 경우
            if (a <= k) {
                d[0] = 9999; // 방문 처리 (9999로 마킹해서 재방문 방지)
                
                // 던전을 탐험하고, 남은 피로도로 나머지 던전을 재귀적으로 탐험
                cnt = Math.max(1 + dfs(k - b, dungeons), cnt); // 최대 탐험 횟수 갱신
                
                d[0] = a; // 던전 상태 복구 (백트래킹)
            }
        }

        return cnt; // 탐험 가능한 최대 던전 수 반환
    }

    // 메인 메서드: 시작 피로도 k, 던전 배열 dungeons 입력
    public int solution(int k, int[][] dungeons) {
        int answer = -1;

        // dfs를 통해 가능한 최대 던전 수 계산
        return dfs(k, dungeons);
    }
}
