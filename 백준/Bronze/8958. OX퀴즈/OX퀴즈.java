import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력을 빠르게 받기 위한 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            String line = br.readLine(); // OX 문자열 한 줄 입력
            
            int score = 0; // 총 점수
            int count = 0; // 연속된 O 개수
            
            // 문자열을 순회하면서 점수 계산
            for (int i = 0; i < line.length(); i++) {
                char ch = line.charAt(i);
                if (ch == 'O') {
                    count++;        // 연속된 O의 개수 증가
                    score += count; // 그 개수만큼 점수 누적
                } else {
                    count = 0;      // X가 나오면 연속 끊기
                }
            }
            
            sb.append(score).append('\n'); // 결과 저장
        }

        System.out.print(sb); // 모든 결과 한 번에 출력
    }
}