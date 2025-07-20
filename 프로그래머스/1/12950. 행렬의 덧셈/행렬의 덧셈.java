class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // arr1과 같은 크기의 2차원 배열을 선언 (정답을 저장할 배열)
        int[][] answer = new int[arr1.length][arr1[0].length];
        
        // 행(row) 반복
        for(int i = 0; i < arr1.length; i++) {
            // 열(column) 반복
            for(int j = 0; j < arr1[0].length; j++) {
                // 같은 위치의 arr1과 arr2의 값을 더해서 answer 배열에 저장
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        
        // 계산이 끝난 2차원 배열 answer를 반환
        return answer;
    }
}