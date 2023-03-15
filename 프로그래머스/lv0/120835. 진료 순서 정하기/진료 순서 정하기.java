import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] ascEmergency = new int[emergency.length];

        for (int i=0; i<emergency.length; i++) {
            ascEmergency[i] = emergency[i];
        }
        Arrays.sort(ascEmergency);
        
        for (int i=0; i<emergency.length; i++) {
            for(int j=0; j < emergency.length; j++){
                if(ascEmergency[i] == emergency[j]) {
                    answer[j] = emergency.length-i;
                }
            }
        }
        return answer;
    }
}