// https://programmers.co.kr/learn/courses/30/lessons/43162
// BFS : 다른 사람이 푼 것 기반으로 셀프 코드리뷰 해야겠다. 

import java.util.*;

class Solution{
    public int solution(int n, int[][] computers) {
        int answer = 0;
        int[] left =new int[n];
        int left_size=n;
        PriorityQueue<Integer> children ;
        int root=0;

        do{
            children = new PriorityQueue<>();
            answer++;
            for(int i=0;i<n;i++){
                if(left[i]==0){
                    root=i;
                    break;
                }
            }

            children.add(root);

            while(!children.isEmpty()){//각각의 자식노드에 대해서
                int child=children.poll();
                left[child]=-1;
                left_size--;


                for(int find=0;find<n;find++){
                    if(computers[child][find]==1&&left[find]==0){//연결&방문전
                        children.add(find);
                        left[find]=-1;//방문체크 여기서 지우면 안되나

                    }
                }

            }


        }while(left_size>0);

        return answer;
    }


}

