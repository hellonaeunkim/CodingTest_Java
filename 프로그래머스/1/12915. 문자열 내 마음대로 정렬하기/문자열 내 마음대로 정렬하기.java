import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        // 각 문자열 앞에 정렬 기준이 될 n번째 문자를 붙인다.
        for(int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].charAt(n) + strings[i];
        }
        
        // 오름차순 정렬
        Arrays.sort(strings);
        
        // 정렬을 위해 붙였던 문자를 제거한 데이터를 strings에 저장한다.
        for(int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].substring(1);
        }
        
        return strings;
    }
}