import java.util.Arrays;
import java.util.stream.Stream;

class Solution {
    public int solution(int n) {
        int answer = Arrays.stream(Stream.of(String.valueOf(n)
            .split("")).mapToInt(Integer::parseInt)
            .toArray()).sum();
        return answer;
    }
}