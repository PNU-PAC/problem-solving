import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Solution3 {
    public static int solution(String[][] clothes) {
        HashMap<String, Integer> hm = new HashMap<>();
        for(String[] cloth:clothes) hm.put(cloth[1],hm.getOrDefault(cloth[1], 0) + 1);
        System.out.printf("hm:%s\n",hm.toString());
        List<Integer> quantities = hm.values().stream().collect(Collectors.toList());
        int answer = 1;
        for(Integer quantity:quantities) answer *= quantity+1;
        answer -=1;

        return answer;
    }

    public static void main(String[] args) throws Exception {
        String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        
        
        System.out.printf("solution:%s\n",solution(clothes));
    }
}
