import java.util.PriorityQueue;
import java.util.Arrays;
import java.util.Collections;

public class Solution3 {
    public static int[] solution(String[] operations){
        int[] answer = {};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(String operation:operations){
            
            
            String[] spl = operation.split(" ");
            if(spl[0].equals("I")){
                pq.add(Integer.valueOf(spl[1]));
            }
            if(spl[0].equals("D")){
                if(spl[1].equals("1")){
                    if(!pq.isEmpty()){
                        PriorityQueue<Integer> pqReversed = new PriorityQueue<>(Collections.reverseOrder());
                        int size = pq.size();
                        for(int i = 0;i < size;i++){
                            pqReversed.add(pq.poll());
                        }
                        pqReversed.poll();
                        int sizeR = pqReversed.size();
                        for(int i = 0;i < sizeR;i++){
                            pq.add(pqReversed.poll());
                        }
                    }
                }
                if(spl[1].equals("-1")){
                    if(!pq.isEmpty()) pq.poll();
                }
            }
        }
        //최소, 최대값 찾기
        if(pq.isEmpty()){
            answer = new int[] {0,0};
        }else{
            int min = pq.peek();
            
            PriorityQueue<Integer> pqReversed = new PriorityQueue<>(Collections.reverseOrder());
            int size = pq.size();
            for(int i = 0;i < size;i++){
                pqReversed.add(pq.poll());
            }
            int max = pqReversed.peek();
            answer = new int[] {max,min};
        }
        return answer;
    }

    public static void main(String[] args) throws Exception {
        String[] operations = {"I 2", "I 1", "I 4", "I 3", "I 7", "I 6", "I 5", "I 8", "I 9", "I 10", "D 1", "D -1", "D 1", "D -1", "I 1", "I 2", "I 3", "I 4", "I 5", "I 6", "I 7", "I 8", "I 9", "I 10", "D 1", "D -1", "D 1", "D -1"};
        System.out.println(Arrays.toString(solution(operations)));
    }
}
