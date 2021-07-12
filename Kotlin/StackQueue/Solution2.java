package src;

import java.util.*;

public class Solution2 {
    public static int solution(int[] priorities, int location) {
        int answer = 1;
        Queue<Integer> qPrior = new LinkedList<>();
        for(int priority:priorities) qPrior.add(priority);
        while(true){
            System.out.println(qPrior.toString());
            System.out.printf("location:%d\n",location);
            if(qPrior.peek() < Collections.max(qPrior)){
                qPrior.add(qPrior.poll());
                location = location == 0 ? qPrior.size() - 1 : location - 1;
            }else{
                qPrior.poll();
                if(location == 0){
                    return answer;
                }else{
                    answer++;
                    System.out.println(answer);
                    location--;
                }
            }
        }
    }

    public static void main(String[] args){
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;

        System.out.println(solution(priorities,location));
    }
}
