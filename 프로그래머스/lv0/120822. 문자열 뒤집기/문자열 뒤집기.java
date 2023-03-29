import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {
        String[] my_stringArr = my_string.split("");
        String[] reverse = new String[my_stringArr.length];

        for(int i = 0; i < my_stringArr.length; i++) {
            reverse[i] = my_stringArr[my_stringArr.length -i -1];
        }
        
        String answer = Arrays
            .stream(reverse)
            .collect(Collectors.joining());
        return answer;
    }
}