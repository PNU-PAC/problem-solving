import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;

//https://programmers.co.kr/questions/17321 참조
//중첩 HashMap 사용해보기
//1,2위곡 정하는 것을 list에 추가하고 정렬한 다음 크기가 3이 넘어가면 3번째 요소를 삭제하는 것으로 구현.

//아직 미완

public class Solution4 {
    public static int[] solution(String[] genres, int[] plays) {
        List<Integer> album = new ArrayList<>();
        HashMap<String, Integer> hmSum = new HashMap<>();
        HashMap<String, int[]> hmPlays = new HashMap<>();
        for(int i = 0;i < genres.length;i++){
            hmSum.put(genres[i],hmSum.getOrDefault(genres[i], plays[i]) + plays[i]);
            if(hmPlays.containsKey(genres[i])){
                int smallNum = hmPlays.get(genres[i])[1];
                int bigNum = hmPlays.get(genres[i])[0];
                int smallPlay = plays[smallNum];
                int bigPlay = plays[bigNum];
                if(smallPlay <= plays[i]){
                    if(bigPlay <= plays[i]){
                        hmPlays.replace(genres[i],new int[]{i,bigNum});
                    } else{
                        hmPlays.replace(genres[i],new int[]{bigNum,i});
                    }
                }
            } else{
                hmPlays.put(genres[i],new int[]{i,0});
            }
        }
        LinkedHashMap<String, int[]> lhmOrdered = hmPlays
                                                    .entrySet()
                                                    .stream()
                                                    .sorted((e1,e2) -> Integer.compare(hmSum.get(e2.getKey()), hmSum.get(e1.getKey())))
                                                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                                            (e1, e2) -> e1, LinkedHashMap::new));
        lhmOrdered.forEach((e1,e2) -> {
            album.add(e2[0]);
            album.add(e2[1]);
        });
        int[] answer = new int[album.size()];
        for(int i = 0;i < album.size();i++){
            answer[i] = album.get(i).intValue();
        }
        return answer;
    }
    public static void main(String[] args) throws Exception {
        String[] genres = {"classic", "pop", "classic", "classic", "pop", "jazz", "jazz", "jazz", "jazz"};
        int[] plays = {500, 600, 150, 800, 2500, 3600, 100, 600, 800, 1200};
        
        
        System.out.printf("solution:%s\n",Arrays.toString(solution(genres,plays)));
    }
}
