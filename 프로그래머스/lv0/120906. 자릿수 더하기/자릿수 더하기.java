import java.util.stream.Stream;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] nArr = Stream.of(String.valueOf(n).split(""))
            .mapToInt(Integer::parseInt).toArray();
        for(int i = 0; i<nArr.length; i++) {
            answer += nArr[i];
        }
        return answer;
    }
}