class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 0; i < n; i++){
            if(i * i == n)
                return 1;
        }
        return 2;
    }
}