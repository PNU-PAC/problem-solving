package src;

import java.util.Queue;
import java.util.stream.Collectors;
import java.util.LinkedList;

public class Solution3 {
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> waiting = new LinkedList<>();
        Queue<Integer> passing = new LinkedList<>();
        for(int truck_weight : truck_weights){
            waiting.add(truck_weight);
        }
        int sec = 0;
        int passingWeight = 0;
        while(true){
            sec++;
            int waitingFront = waiting.isEmpty() ? 0 : waiting.peek();
            int passingFront = passing.isEmpty() ? 0 : passing.peek();
            int subtract = passing.size() < bridge_length ? 0 : passing.peek();
            if(passingWeight + waitingFront - subtract <= weight){
                passingWeight += waitingFront;
                passing.offer(waitingFront);
                waiting.poll();
            }else{
                passing.offer(0);
            }
            
            if(passing.size() > bridge_length){
                passingWeight -= passingFront;
                passing.poll();
            }
            System.out.println(waiting.toString());
            System.out.println(passing.toString());
            if(passing.stream().collect(Collectors.summingInt(Integer::intValue)) == 0) return sec;
        }
    }

    public static void main(String[] args){
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7,4,5,6};
        int answer = solution(bridge_length, weight, truck_weights);
        System.out.println(answer);

    }
}
