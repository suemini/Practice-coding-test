import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String answer = "";
        String[] nArr = (String.valueOf(n)).split("");
        Arrays.sort(nArr);    
        for(int i=nArr.length-1; i>=0; i--) {
        	answer += nArr[i];
        }
        return Long.parseLong(answer);
    }
}