class Solution {
    public String solution(String phone_number) {
        String answer = ""; // 결과를 저장할 문자열 초기화
        int length = phone_number.length(); // 전체 전화번호 길이 계산

        // 마지막 4자리를 제외한 앞부분을 '*'로 채움
        for (int i = 0; i < length - 4; i++) {
            answer += "*";
        }

        // 전화번호의 마지막 4자리를 잘라서 기존 문자열 뒤에 붙임
        answer += phone_number.substring(length - 4);

        // 최종 가려진 전화번호 반환
        return answer;
    }
}
