import java.util.HashSet;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution2 {

    public static boolean solution(String[] phone_book){
        HashSet<String> set = (HashSet<String>)Arrays.stream(phone_book).sorted().collect(Collectors.toSet());
        for(String num:set) for(int i = 1;i < num.length();i++){
            if(set.contains(num.substring(0, i))) return false;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        String[] phone_book = {"111113", "1112", "12","25","24","190273091","19027309"};
        
        
        System.out.println(solution(phone_book));
    }
}
