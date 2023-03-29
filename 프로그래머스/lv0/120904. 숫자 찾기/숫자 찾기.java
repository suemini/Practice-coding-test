import java.util.stream.Stream;

class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        int[] numArr = Stream.of(String.valueOf(num).split(""))
            .mapToInt(Integer::parseInt).toArray();
        for(int i = 0; i<numArr.length; i++) {
            if(numArr[i] == k) {
                answer = i+1;
                break;
            } else {
                answer = -1;
            }
        }
        return answer;
    }
}