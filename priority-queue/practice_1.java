//https://programmers.co.kr/learn/courses/30/lessons/42629
// 오답이지만(효율성 테스트케이스 1번 실패), 지금은 더 나은 방법이 생각나지 않기 때문에 일단 기록

import java.util.*;
class Solution{
  
    public int solution(int stock, int[] dates, int[] supplies, int k) {
        int answer=0;
       PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());//큰 수 부터   & 날짜가 스톡+1보다 작거나 같은것부터
        
        int date_i=0;
        //수량 확보 전까지
        while(stock<k+1){
            // 중간부터해서 수량확보되면 안되니까
            //처음에 있는 것만 큐에 넣음
            for(;date_i<dates.length;date_i++){
                if(dates[date_i]>stock+1){
                    break;
                }
                queue.add(supplies[date_i]);
            }
           
            int get=queue.poll();
            answer++;
            stock+=get;
        }
        return answer;
    }
}
