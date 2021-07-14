import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class Solution1 {
    public static int solution(int[] scoville, int K){
        int answer = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.addAll(Arrays.stream(scoville).boxed().collect(Collectors.toList()));
        while(true){
            if(minHeap.peek() >= K){
                return answer;
            }else{
                if(minHeap.size() < 2){
                    return -1;
                }
            }
            answer++;
            int newFood = minHeap.remove() + minHeap.remove() * 2;
            minHeap.add(newFood);
        }
    }

    public static void main(String[] args) throws Exception {
        int[] scoville = {1,2,3,9,10,12};
        int K = 7;
        System.out.println(solution(scoville, K));
    }
}
