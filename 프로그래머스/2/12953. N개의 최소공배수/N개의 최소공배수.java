class Solution {
    public int solution(int[] arr) {
        int answer = 0;

        // 배열 길이가 1이면, 최소공배수는 자기 자신
        if(arr.length == 1) return arr[0];

        // arr[0]과 arr[1]의 최소공배수를 구하기
        int g = gcd(arr[0], arr[1]);          // 최대공약수(GCD) 계산
        answer = (arr[0] * arr[1]) / g;       // LCM = (a * b) / GCD

        // 배열에 요소가 2개 이상일 경우, 차례로 LCM을 확장해 나간다
        if(arr.length > 2) { 
            for(int i = 2; i < arr.length; i++) {
                g = gcd(answer, arr[i]);          // 현재까지의 LCM과 arr[i]의 GCD 구하기
                answer = (answer * arr[i]) / g;   // 두 수의 LCM을 다시 계산해 answer 갱신
            }
        }

        return answer;   // 최종적으로 모든 수의 LCM 반환
    }

    // 최대공약수(GCD)를 구하는 함수 (유클리드 호제법)
    private static int gcd(int a, int b) {
        int r = a % b;           // 나머지
        if(r == 0) return b;     // 나머지가 0이면 b가 최대공약수
        else return gcd(b, r);   // 나머지가 0이 아니면, b와 r로 다시 반복
    }
}