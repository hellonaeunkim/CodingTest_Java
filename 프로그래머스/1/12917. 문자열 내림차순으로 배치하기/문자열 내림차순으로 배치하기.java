import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        // 입력받은 문자열을 문자 배열로 변환
        char [] c = s.toCharArray();
        
        // 문자 배열을 오름차순으로 정렬
        Arrays.sort(c);
        
        // 정렬된 문자 배열을 다시 문자열로 변환
        String str = new String(c);
        
        // 문자열을 뒤집어서(역순으로) 저장
        answer = new StringBuilder(str).reverse().toString();
        
        return answer;
    }
}