//https://programmers.co.kr/learn/courses/30/lessons/43104
//재귀함수로 풀었을 때 시간초과
class Solution {
    public long solution(int N) {
        long answer = 0;
        int width=0;
        int height=0;
        int[] w_h=getXY(N);
        return w_h[0]*2+w_h[1]*2 ;
    }
    public static int[] getXY(int N){
        int[] answer = {1,1};
        int[] answer2=new int[2];
        if(N==1){
            return answer;
        } 
        if(N==2){
            answer[1]=2;
            return answer;
        }
        answer2=getXY(N-2);
        answer=getXY(N-1);
        answer[0]+=answer2[0];
        answer[1]+=answer2[1];
        return answer;
        
    }
}
