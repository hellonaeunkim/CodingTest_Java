import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader: 표준 입력(System.in)으로부터 한 줄씩 빠르게 읽기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 출력 결과를 효율적으로 모아두기 위해 StringBuilder 사용
        StringBuilder sb = new StringBuilder();
        // 한 줄 입력 받기 (ex. "baekjoon")
        String str = br.readLine();
        
        // 알파벳 'a'부터 'z'까지 반복
        for(char c = 'a'; c <= 'z'; c++) {
            // String 클래스의 indexOf() 메서드를 사용해 해당 문자가 str 안에서 처음 등장하는 위치를 찾음
            // 없으면 -1 반환
            sb.append(str.indexOf(c) + " ");
        }
        System.out.println(sb);
    }
}