import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution1 {
    public static String solution(String[] participant, String[] completion){
        String output = "";
        List<String> partList = Arrays.asList(participant).stream().sorted()
            .collect(Collectors.toList());
        List<String> compList = Arrays.asList(completion).stream().sorted()
            .collect(Collectors.toList());
        
        int compLength = participant.length-1;

        for(int i = 0;i < compLength;i++){

            if(!partList.get(i).equals(compList.get(i))){
                output = partList.get(i);
                break;
            }
        }
        if(output.equals("")) output = partList.get(compLength);
        return output;
    }
}
