class Solution {
    public long solution(int price, int money, int count) {

        long sum = 0;
        
        // price를 count 만큼 곱하며 더해준다.
        for(int i = 1; i <= count; i++) {
            sum += price * i;
        }
        
        // 더한 금액과 money를 비교
        // 모자란 금액 계산
        if(sum > money) {
            return sum - money;
        } else {
            return 0;
        }
    }
}