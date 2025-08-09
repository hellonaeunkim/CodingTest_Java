class Solution {
    public int solution(String t, String p) {
        // p의 길이 저장 (비교할 부분 문자열의 길이)
        int len = p.length();
        // 조건 만족하는 부분문자열 개수
        int count = 0;
        
        // 숫자 크기 비교를 위해 String 타입을 Long으로 변환
        // int로 하면 범위 초과 가능성이 있어서 long 사용
        long pValue = Long.parseLong(p);
        
        // t에서 길이 len짜리 부분 문자열을 순서대로 확인
        for(int i = 0; i <= t.length() - len; i++) {
            // 현재 위치에서 길이 len만큼 잘라서 숫자로 변환
            long subValue = Long.parseLong(t.substring(i, i + len));
            // 잘라낸 숫자가 pValue보다 작거나 같으면 카운트 증가
            if(subValue <= pValue) {
                count++;
            }
        }
        
        return count;
    }
}