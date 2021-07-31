package ex;

import java.util.PriorityQueue;

public class Scoville {
	
	public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        
        for(int s : scoville) {
        	queue.add(s);
        }
        
        while(queue.peek() < K) {
        	if(queue.size()==1) {
        		return -1;
        	}
        	
        	int least = queue.poll();
        	int least2 = queue.poll();
        	
        	int result = least + (least2 * 2);
        	
        	queue.add(result);
        	answer++;
        	
        	
        }
        
        
        return answer;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
