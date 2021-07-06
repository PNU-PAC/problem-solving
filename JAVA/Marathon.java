package ex;

import java.util.HashMap;

public class Marathon {

	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> tempMap = new HashMap<String, Integer>();
        
        for(String name : participant) tempMap.put(name, tempMap.getOrDefault(name, 0) + 1);
        System.out.println(tempMap);
        
        for(String name : completion) tempMap.put(name, tempMap.get(name) - 1);
        System.out.println(tempMap);
        
        for(String name : tempMap.keySet()) {
        	if(tempMap.get(name) > 0) {
        		answer = name;
        		break;
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana", "ana"};
		String[] completion = {"stanko", "ana", "mislav", "ana"};
		System.out.println(solution(participant, completion));

	}

}
