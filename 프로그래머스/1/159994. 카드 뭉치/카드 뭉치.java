class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        
        // cards1과 cards2에서 현재 가리키고 있는 위치(인덱스)를 저장
        int c1 = 0;
        int c2 = 0;
        
        // goal 배열을 순서대로 탐색
        for(String st : goal) {
                // 만약 cards1에서 아직 남은 카드가 있고, goal의 현재 단어와 일치한다면
                if(c1 < cards1.length && st.equals(cards1[c1])) {
                    c1++;
                // 그렇지 않고 cards2에서 아직 남은 카드가 있고, goal의 현재 단어와 일치한다면
                }else if(c2 < cards2.length && st.equals(cards2[c2])) {
                    c2++;
                // 둘 다 해당하지 않으면, goal의 순서를 만들 수 없으므로 실패
                }else {
                    return "No";
                }
            }
        return "Yes";
    }
}