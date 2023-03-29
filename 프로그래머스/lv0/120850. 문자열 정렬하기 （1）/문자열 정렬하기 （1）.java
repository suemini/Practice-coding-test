import java.util.stream.Stream;

class Solution {
    public int[] solution(String my_string) {
        my_string = my_string.replaceAll("[a-z]", "");
        int[] answer = Stream.of(my_string.split(""))
            .sorted().mapToInt(Integer::parseInt).toArray();
        return answer;
    }
}