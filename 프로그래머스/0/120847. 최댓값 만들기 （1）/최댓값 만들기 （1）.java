import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int maxIndex = numbers.length - 1;
        int secondMaxIndex = numbers.length - 2;
        return numbers[maxIndex] * numbers[secondMaxIndex];
    }
}