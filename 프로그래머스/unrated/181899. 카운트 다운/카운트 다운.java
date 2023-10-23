class Solution {
    public int[] solution(int start, int end_num) {
        int[] answer = new int[start - end_num + 1]; 
        int i = 0;
        
        while (start >= end_num) { 
            answer[i] = start;
            i++;
            start--;
        }
        
        return answer;
    }
}
