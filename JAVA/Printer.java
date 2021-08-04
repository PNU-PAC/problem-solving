package ex;

import java.util.LinkedList;
import java.util.Queue;

public class Printer {
	
	public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> printQueue = new LinkedList<Integer>();
        
        for(int i : priorities) {
        	printQueue.add(i);
        }
        
        for(int i=location;i<priorities.length;i++) {
        	if(i>priorities[location]) {
        		int temp=printQueue.poll();
        		printQueue.add(temp);

        	}
        }

        
        return answer;
    }
	
	public static void main(String[] args) {
		

	}

}
