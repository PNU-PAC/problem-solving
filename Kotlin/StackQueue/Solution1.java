package src;

import java.util.Arrays;
import java.util.ArrayList;

public class Solution1 {
    public static int[] solution(int[] progresses, int[] speeds) {
        Boolean[] isCompleted = new Boolean[progresses.length];
        Arrays.fill(isCompleted,false);
        int publish = 0;
        ArrayList<Integer> publishNum = new ArrayList<>();
        //하루 지나기
        while(Arrays.asList(isCompleted).stream().anyMatch(a -> a == false)){
            for(int i = 0;i < progresses.length;i++){
                progresses[i] += speeds[i];
            }
            for(int i = 0;i < progresses.length;i++){
                if(progresses[i] >= 100 && isCompleted[i] == false){
                    if(i > 0){
                        if(isCompleted[i-1] == true){
                            publish++;
                            isCompleted[i] = true;
                        }
                    }else{
                        publish++;
                        isCompleted[i] = true;
                    }
                }
            }
            if(publish > 0){
                publishNum.add(publish);
                publish = 0;
            }
        }
        int[] answer = new int[publishNum.size()];
        for(int i = 0;i < answer.length;i++){
            answer[i] = publishNum.get(i).intValue();
        }
        
        return answer;
    }

    public static void main(String[] args){
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};

        System.out.println(Arrays.toString(solution(progresses,speeds)));
    }
}

