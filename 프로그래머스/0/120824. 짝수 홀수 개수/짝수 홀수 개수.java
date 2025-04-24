class Solution {
    public int[] solution(int[] num_list) {
        
        int[] result;
        int even = 0;
        int odd = 0;
        
        for(int i = 0; i < num_list.length; i++) {
            
            if (num_list[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            
        }
        
        result = new int[]{even, odd};
        
        return result;
            
    }
}