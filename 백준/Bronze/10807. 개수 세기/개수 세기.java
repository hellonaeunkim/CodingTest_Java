import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        // BufferedReader: 표준 입력(System.in)으로부터 한 줄씩 빠르게 읽기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter: 출력 시 버퍼를 사용해 빠르게 출력하기 위한 클래스
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 첫 번째 입력 : 정수의 개수 N
        int N = Integer.parseInt(br.readLine());
        
        // 특정 값과 같은 값이 몇 개 있는지 세기 위한 변수
        int count = 0;
        
        // 크기가 N인 정수 배열 생성
        int[] arr = new int[N];

        // 두 번째 입력: N개의 정수를 한 줄에 공백으로 구분하여 입력받음
        StringTokenizer st = new StringTokenizer(br.readLine());;

        // 배열에 입력된 정수들을 순서대로 저장
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 세 번째 입력: 우리가 찾고 싶은 특정 정수 b
        int b = Integer.parseInt(br.readLine());

        // 배열을 순회하면서 b와 같은 값이 몇 개 있는지 검사
        for(int j = 0; j < arr.length; j++){
            if(b == arr[j]) {
                count++; // b와 같은 값 발견 시 카운트 증가
            }
        }
        System.out.println(count);

        // 입력 스트림 종료
        br.close();
        // 출력 스트림 비우기 및 종료
        bw.flush();
        bw.close();
    }
}