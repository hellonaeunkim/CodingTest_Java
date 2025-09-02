import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
    public static void main(String[] args) throws IOException {
 
        // 빠른 입력을 위한 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        // 첫 줄: 시험 과목 개수 N
        // double 배열을 만든다 (점수 계산에 소수점이 필요하므로 double 사용)
        double arr[] = new double[Integer.parseInt(br.readLine())];
        
        // 둘째 줄: 점수들을 공백 단위로 읽어오기
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        // 점수를 배열에 저장
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Double.parseDouble(st.nextToken());
        }
        
        // 점수 조작 후의 합계
        double sum = 0;
        
        // 배열을 정렬해서 최댓값을 구하기 위함
        Arrays.sort(arr);
        
        // 모든 점수를 (현재 점수 / 최댓값 * 100) 형태로 변환한 뒤 합산
        for (int i = 0; i < arr.length; i++) {
            sum += (arr[i] / arr[arr.length - 1]) * 100;
        }
        
        // 조작된 점수들의 평균 출력
        System.out.print(sum / arr.length);
    }
}