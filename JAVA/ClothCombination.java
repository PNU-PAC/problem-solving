package ex;

import java.util.HashMap;

public class ClothCombination {

	public static int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String, Integer> typeMap = new HashMap<String, Integer>();

        
        for(int i=0;i<clothes.length;i++) {
        	typeMap.put(clothes[i][1], typeMap.getOrDefault(clothes[i][1], 0)+1);
        	
        }
        System.out.println(typeMap);
        
        for(String type : typeMap.keySet()) {
        	//조합의 수 구하기
        	//옷 종류 + 1 (그 종류를 입지 않을 경우 포함)
        	answer = answer * (typeMap.get(type)+1);
        	
        }
        //아무것도 입지 않는 경우 제외
        answer -= 1;
        
        return answer;
    }
	
	public static void main(String[] args) {
		String[][] clothes = {{"yellowhat", "headgear"},{"bluesunglasses", "eyewear"},{"green_turban", "headgear"}};
		System.out.println(solution(clothes));

	}

}
