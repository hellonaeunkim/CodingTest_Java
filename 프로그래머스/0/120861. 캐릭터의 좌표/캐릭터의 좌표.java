class Solution {
    public int[] solution(String[] keyinput, int[] board) {

        int[] result = new int[2];
    
        // x좌표의 최댓값
        int xMax = (board[0] - 1) / 2;

        // x좌표의 최소값
        int xMin = ((board[0] - 1) / 2) * - 1;

        // y좌표의 최댓값
        int yMax = (board[1] - 1) / 2;

        // y좌표의 최소값
        int yMin = ((board[1] - 1) / 2) * - 1;

        for (String key : keyinput) {
            if (key.equals("up") && result[1] < yMax) { 
                result[1]++;
            } else if (key.equals("down") && result[1] > yMin) {
                result[1]--;
            } else if (key.equals("left") && result[0] > xMin) {
                result[0]--;
            } else if (key.equals("right") && result[0] < xMax) {
                result[0]++;
            }
        }
        return result;
    }
}