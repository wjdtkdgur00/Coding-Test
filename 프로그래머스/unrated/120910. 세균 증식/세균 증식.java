class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        int sum=1;
        for(int i =0;i<t;i++){
            sum*=2;
        }
        answer = n*sum;
        return answer;
    }
}