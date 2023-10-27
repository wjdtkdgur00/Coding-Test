class Solution {
    public String solution(int num) {
        String answer = "";
        answer = (num % 2== 1) ? "Odd" : "Even";
        if(num<0){
            answer = (-num%2==1)? "Odd" : "Even";
        }
        return answer;
    }
}